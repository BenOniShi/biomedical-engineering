package com.cdmu.controller;

import com.cdmu.model.ResultInfo;
import com.cdmu.pojo.vo.ModulesInfo;
import com.cdmu.service.ModulesServiceI;
import com.cdmu.utils.ResultInfoUtil;
import com.google.inject.util.Modules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: BenOnSHI
 * @Date: 2020/4/19 11:36
 **/
@Controller
@RequestMapping("/index")
public class IndexController extends BaseController {


    @Autowired
    private ResultInfoUtil resultInfoUtil;
    @Autowired
    private ModulesServiceI modulesServiceI;


    @RequestMapping(value = "/{page}", method = RequestMethod.GET)
    public ModelAndView page(@PathVariable String page) {
        ModelAndView modelAndView = new ModelAndView();
        switch (page) {
            case "index":
                modelAndView.setViewName("index");
                break;
            case "manager":
                modelAndView.setViewName("manager");
                break;
            default:
                break;

        }
        return modelAndView;
    }

    /**
     * 后台管理界面返回模块列表
     *
     * @return
     */
    @RequestMapping(value = "/managerModuleList", method = RequestMethod.GET)
    @ResponseBody
    public ModulesInfo managerModuleList() {
        return modulesServiceI.managerModuleList();
    }


}
