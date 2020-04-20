package com.cdmu.controller;

import com.cdmu.utils.ResultInfoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: BenOnSHI
 * @Date: 2020/4/19 11:36
 **/
@Controller
public class IndexController {

    @Autowired
    private ResultInfoUtil resultInfoUtil;


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView info() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
