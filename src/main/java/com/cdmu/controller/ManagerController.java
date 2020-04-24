package com.cdmu.controller;

import com.cdmu.pojo.vo.ModulesInfo;
import com.cdmu.service.IModulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author BenOniShi
 * @date 2020/4/24 23:58
 */
@RequestMapping("/manager")
@Controller
public class ManagerController extends BaseController {

    @Autowired
    private IModulesService modulesService;

    @RequestMapping(value = "/{page}", method = RequestMethod.GET)
    public ModelAndView page(@PathVariable String page) {
        ModelAndView modelAndView = new ModelAndView();
        switch (page) {
            case "main":
                modelAndView.setViewName("manager");
                break;
            case "index":
                modelAndView.setViewName("manager-index");
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
        return modulesService.managerModuleList(super.role);
    }
}
