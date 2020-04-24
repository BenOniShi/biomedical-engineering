package com.cdmu.service;

import com.cdmu.pojo.vo.ModulesInfo;

/**
 * @author BenOniShi
 * @date 2019/12/23 14:51
 */
public interface IPermissionService {


    ModulesInfo queryMenuBarByRoleId(Integer roleId);

}
