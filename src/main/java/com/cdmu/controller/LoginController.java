package com.cdmu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author BenOniShi
 * @date 2020/4/21 22:43
 */
@RequestMapping("/login")
@Controller
public class LoginController {

    /**
     * @param page restful
     * @return
     */
    @RequestMapping(value = "{page}", method = RequestMethod.GET)
    public ModelAndView page(@PathVariable String page, Integer cusId) {
        ModelAndView modelAndView = new ModelAndView();
        switch (page) {
            case "login":
                modelAndView.setViewName("login");
                break;
            default:
                break;
        }
        return modelAndView;
    }
}