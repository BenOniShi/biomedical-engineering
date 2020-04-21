package com.cdmu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 指导流程
 *
 * @Author: BenOnSHI
 * @Date: 2020/4/21 16:34
 **/
@RequestMapping("/process")
@Controller
public class GuideProcessController {


    /**
     * @param page
     * @return
     */
    @RequestMapping(value = "{page}", method = RequestMethod.GET)
    public ModelAndView page(@PathVariable String page) {
        ModelAndView modelAndView = new ModelAndView();
        switch (page) {
            case "list":
                modelAndView.setViewName("guide-process/process-list");
                break;
            default:
                break;
        }
        return modelAndView;
    }
}
