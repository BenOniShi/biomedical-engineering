package com.cdmu.service.impl;

import com.cdmu.mapper.ModuleMapper;
import com.cdmu.mapper.PermissionMapper;
import com.cdmu.pojo.Module;
import com.cdmu.pojo.ModuleExample;
import com.cdmu.pojo.Permission;
import com.cdmu.pojo.PermissionExample;
import com.cdmu.pojo.vo.Modules;
import com.cdmu.pojo.vo.ModulesInfo;
import com.cdmu.service.IPermissionService;
import com.cdmu.service.IUserRoleService;
import com.cdmu.utils.AssertsUtils;
import com.cdmu.utils.JsonUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author BenOniShi
 * @date 2020/4/24 23:42
 */
@Service
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private PermissionMapper permissionMapper;
    @Autowired
    private ModuleMapper moduleMapper;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    @Autowired
    private IUserRoleService userRoleService;
    @Value("${user-modules-redis-key}")
    private String empModulesRedisKey;


    @Override
    public ModulesInfo queryMenuBarByRoleId(Integer roleId) {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ModulesInfo modulesInfo = new ModulesInfo();
        String modulesInfoForRedis = ops.get(empModulesRedisKey + roleId);
        if (StringUtils.isNotBlank(modulesInfoForRedis)) {
            return JsonUtil.jsonStr2Object(modulesInfoForRedis, ModulesInfo.class);
        } else {
            PermissionExample permissionExample = new PermissionExample();
            permissionExample.createCriteria()
                    .andRoleIdEqualTo(roleId)
                    .andAclValueEqualTo("1");
            List<Permission> permissions = permissionMapper.selectByExample(permissionExample);
            AssertsUtils.isTrue(CollectionUtils.isEmpty(permissions), "抱歉，您没有任何权限");
            List<Module> modulesListForPermissions = new ArrayList<>();
            permissions.forEach(permission -> {
                ModuleExample moduleExample = new ModuleExample();
                moduleExample.createCriteria().andIdEqualTo(permission.getModuleId()).andIsValidEqualTo(1);
                List<Module> modules = moduleMapper.selectByExample(moduleExample);
                if (CollectionUtils.isNotEmpty(modules)) {
                    modulesListForPermissions.add(modules.get(0));
                }
            });
            //先查询一级菜单，将一级菜单放入map  最终返回的 moduleInfo中
            Map<String, Modules> modulesMap = new HashMap<>();
            modulesListForPermissions.forEach(module -> {
                if (0 == module.getParentId()) {
                    Modules modules = new Modules();
                    modules.setTitle(module.getModuleName());
                    modules.setHref(module.getHref());
                    modules.setIcon(module.getIcon());
                    modules.setTarget(module.getTarget());
                    List<Modules> levelTwoModulesList = new ArrayList<>();
                    //遍历一级菜单 查询二级菜单
                    modulesListForPermissions.forEach(submodule -> {
                        if (module.getId().equals(submodule.getParentId())) {
                            Modules submodules = new Modules();
                            submodules.setTitle(submodule.getModuleName());
                            submodules.setHref(submodule.getHref());
                            submodules.setIcon(submodule.getIcon());
                            submodules.setTarget(submodule.getTarget());
                            List<Modules> levelThreeModulesList = new ArrayList<>();
                            //遍历二级菜单 查询三级菜单
                            modulesListForPermissions.forEach(grandsonModule -> {
                                if (submodule.getId().equals(grandsonModule.getParentId())) {
                                    Modules grandsonModules = new Modules();
                                    grandsonModules.setTitle(grandsonModule.getModuleName());
                                    grandsonModules.setHref(grandsonModule.getHref());
                                    grandsonModules.setIcon(grandsonModule.getIcon());
                                    grandsonModules.setTarget(grandsonModule.getTarget());
                                    levelThreeModulesList.add(grandsonModules);
                                }
                            });
                            submodules.setChild(levelThreeModulesList);
                            levelTwoModulesList.add(submodules);
                        }
                    });
                    modules.setChild(levelTwoModulesList);
                    modulesMap.put(module.getModuleName(), modules);
                }
            });
            modulesInfo.setMenuInfo(modulesMap);
            String StrModulesInfoForData = JsonUtil.object2JsonStr(modulesInfo);
            ops.set(empModulesRedisKey + roleId, StrModulesInfoForData);
        }
        return modulesInfo;
    }
}
