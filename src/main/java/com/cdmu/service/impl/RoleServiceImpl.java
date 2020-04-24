package com.cdmu.service.impl;

import com.cdmu.mapper.RoleMapper;
import com.cdmu.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author BenOniShi
 * @date 2020/4/24 23:21
 */
@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;


    @Override
    public List<Integer> queryUserRoleIdsByEid(Integer userId) {
        return roleMapper.queryUserRoleIdsByUid(userId);
    }

    @Override
    public List<Integer> queryRolePermissionIdsByRid(Integer rid) {
        return roleMapper.queryRolePermissionIdsByRid(rid);
    }
}
