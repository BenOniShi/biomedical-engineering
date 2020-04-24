package com.cdmu.service.impl;

import com.cdmu.mapper.UserMapper;
import com.cdmu.pojo.User;
import com.cdmu.pojo.UserExample;
import com.cdmu.service.IUserService;
import com.cdmu.utils.AssertsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author BenOniShi
 * @date 2020/4/24 23:20
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryEmpByName(String username) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        AssertsUtils.isTrue(CollectionUtils.isEmpty(users), "用户不存在，请重新输入");
        return users.get(0);
    }
}
