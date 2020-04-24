package com.cdmu.config;

import com.cdmu.constant.TypeConstant;
import com.cdmu.model.ActiveUser;
import com.cdmu.pojo.Module;
import com.cdmu.pojo.User;
import com.cdmu.service.IModulesService;
import com.cdmu.service.IRoleService;
import com.cdmu.service.IUserService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: walt
 * @Date: 2019/12/30 16:29
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    @Lazy  //只有使用的时候才会加载
    private IUserService userService;

    @Autowired
    @Lazy
    private IModulesService modulesService;

    @Autowired
    @Lazy
    private IRoleService roleService;

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    /**
     * 认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        User user = userService.queryEmpByName(token.getPrincipal().toString());

        if (null != user) {
            ActiveUser aUser = new ActiveUser();
            aUser.setUser(user);

            Integer userId = user.getId();
            //根据用户ID查询角色
            List<Integer> currentempRoleIds = roleService.queryUserRoleIdsByEid(userId);
            //根据角色ID取到权限和菜单ID
            Set<Integer> mids = new HashSet<>();
            for (Integer rid : currentempRoleIds) {
                List<Integer> moduleIds = roleService.queryRolePermissionIdsByRid(rid);
                mids.addAll(moduleIds);
            }
            List<Module> list = new ArrayList<>();
            //根据角色ID查询权限
            if (mids.size() > 0) {
                list = modulesService.queryModules(mids);
            }
            List<String> percodes = new ArrayList<>();
            if (!(CollectionUtils.isEmpty(list))) {
                for (Module module : list) {
                    percodes.add(module.getPercode());
                }
            }
            //放到
            aUser.setPermissions(percodes);

            ByteSource credentialsSalt = ByteSource.Util.bytes(user.getA2sk());
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(aUser, user.getUserPwd(), credentialsSalt,
                    this.getName());
            return info;
        }
        return null;
    }

    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        ActiveUser aUser = (ActiveUser) principals.getPrimaryPrincipal();
        User user = aUser.getUser();
        List<String> permissions = aUser.getPermissions();
        if (user.getId().equals(TypeConstant.TYPE_EMP_SUPER)) {
            authorizationInfo.addStringPermission("*:*");
        } else {
            if (null != permissions && permissions.size() > 0) {
                authorizationInfo.addStringPermissions(permissions);
            }
        }
        return authorizationInfo;
    }

}
