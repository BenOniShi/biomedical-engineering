package com.cdmu.service.impl;

import com.cdmu.constant.TypeConstant;
import com.cdmu.mapper.ModuleMapper;
import com.cdmu.pojo.Module;
import com.cdmu.pojo.ModuleExample;
import com.cdmu.pojo.User;
import com.cdmu.pojo.vo.Modules;
import com.cdmu.pojo.vo.ModulesInfo;
import com.cdmu.service.IModulesService;
import com.cdmu.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @Author: BenOnSHI
 * @Date: 2020/4/23 12:26
 **/
@Service
public class ModulesServiceImpl implements IModulesService {

    @Autowired
    private ModuleMapper moduleMapper;
    @Autowired
    private IPermissionService permissionService;

    @Override
    public ModulesInfo managerModuleList(Integer roleId) {
        ModulesInfo modulesInfo = permissionService.queryMenuBarByRoleId(roleId);
        Modules modulesHome = new Modules();
        modulesHome.setHref("/manager/index");
        modulesHome.setTitle("首页");
        modulesHome.setIcon("fa fa-home");
        System.out.println("-------------------------------------------------");
        System.out.println(modulesHome);
        Modules modulesLogo = new Modules();
        modulesLogo.setTitle("CDMU");
        modulesLogo.setImage("/static/images/logo1.png");
        modulesLogo.setHref("");
        Modules modulesClear = new Modules();
        modulesClear.setClearUrl("/static/api/clear.json");
        modulesInfo.setHomeInfo(modulesHome);
        modulesInfo.setLogoInfo(modulesLogo);
        modulesInfo.setClearInfo(modulesClear);
        return modulesInfo;
    }

    @Override
    public List<Module> queryModules(Set<Integer> mids) {
        ModuleExample moduleExample = new ModuleExample();
        List<Integer> list = new ArrayList();
        mids.forEach(s -> {
            list.add(s);
        });
        moduleExample.createCriteria().andTypeEqualTo(TypeConstant.TYPE_PERMISSION).andIdIn(list);
        List<Module> modules = moduleMapper.selectByExample(moduleExample);
        return CollectionUtils.isEmpty(modules) ? null : modules;
    }
}
