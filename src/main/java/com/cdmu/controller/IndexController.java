package com.cdmu.controller;

import com.cdmu.service.IModulesService;
import com.cdmu.utils.ResultInfoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: BenOnSHI
 * @Date: 2020/4/19 11:36
 **/
@Controller
@RequestMapping("/index")
public class IndexController  {


    @Autowired
    private ResultInfoUtil resultInfoUtil;
    @Autowired
    private IModulesService modulesServiceI;


    @RequestMapping(value = "/{page}", method = RequestMethod.GET)
    public ModelAndView page(@PathVariable String page) {
        ModelAndView modelAndView = new ModelAndView();
        switch (page) {
            case "index":
                modelAndView.setViewName("index");
                break;
            case "login":
                modelAndView.setViewName("login");
                break;
            case "manager":
                modelAndView.setViewName("manager");
                break;
            default:
                break;

        }
        return modelAndView;
    }




}
