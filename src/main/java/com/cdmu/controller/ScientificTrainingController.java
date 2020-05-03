package com.cdmu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 科研训练
 * @author BenOniShi
 * @date 2020/5/2 18:54
 */
@RequestMapping("/training")
@Controller
public class ScientificTrainingController {


    /**
     * @param page restful
     * @return
     */
    @RequestMapping(value = "{page}", method = RequestMethod.GET)
    public ModelAndView page(@PathVariable String page) {
        ModelAndView modelAndView = new ModelAndView();
        switch (page) {
            case "list":
                modelAndView.setViewName("scientific-training/training-list");
                break;
            default:
                break;
        }
        return modelAndView;
    }

}
