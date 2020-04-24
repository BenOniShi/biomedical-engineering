package com.cdmu.service;

import com.cdmu.pojo.Module;
import com.cdmu.pojo.vo.ModulesInfo;

import java.util.List;
import java.util.Set;

/**
 * @Author: BenOnSHI
 * @Date: 2020/4/23 12:26
 **/
public interface IModulesService {
    ModulesInfo managerModuleList(Integer roleId);

    List<Module> queryModules(Set<Integer> mids);
}
