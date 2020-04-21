package com.cdmu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 文章
 *
 * @Author: BenOnSHI
 * @Date: 2020/4/21 16:37
 **/
@RequestMapping("/article")
public class ArticleController {

    /**
     * @param page restful
     * @return
     */
    @RequestMapping(value = "{page}", method = RequestMethod.GET)
    public ModelAndView page(@PathVariable String page, Integer cusId) {
        ModelAndView modelAndView = new ModelAndView();
        switch (page) {
            case "list":
                modelAndView.setViewName("article-list/article-list");
                break;
            default:
                break;
        }
        return modelAndView;
    }
}
