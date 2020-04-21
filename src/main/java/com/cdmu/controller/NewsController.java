package com.cdmu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 新闻动态
 *
 * @Author: BenOnSHI
 * @Date: 2020/4/21 16:49
 **/
@RequestMapping("/news")
@Controller
public class NewsController {
    /**
     * @param page restful
     * @return
     */
    @RequestMapping(value = "{page}", method = RequestMethod.GET)
    public ModelAndView page(@PathVariable String page, Integer cusId) {
        ModelAndView modelAndView = new ModelAndView();
        switch (page) {
            case "list":
                modelAndView.setViewName("news-information/news-list");
                break;
            default:
                break;
        }
        return modelAndView;
    }
}
