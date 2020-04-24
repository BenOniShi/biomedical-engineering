package com.cdmu.service.impl;

import com.cdmu.mapper.UserRoleMapper;
import com.cdmu.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author BenOniShi
 * @date 2020/4/24 23:45
 */
@Service
public class UserRoleServiceImpl implements IUserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;


    @Override
    public Integer queryRoleIdByUserId(Integer uid) {
        return userRoleMapper.queryRoleIdByUserId(uid);
    }
}
