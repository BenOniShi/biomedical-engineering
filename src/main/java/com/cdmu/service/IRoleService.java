package com.cdmu.service;

import java.util.List;

/**
 * @author BenOniShi
 * @date 2020/4/24 23:20
 */
public interface IRoleService {
    List<Integer> queryUserRoleIdsByEid(Integer userId);

    List<Integer> queryRolePermissionIdsByRid(Integer rid);
}
