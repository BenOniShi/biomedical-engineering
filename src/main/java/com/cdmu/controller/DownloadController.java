package com.cdmu.controller;

import com.cdmu.model.ResultInfo;
import com.cdmu.service.IArticleService;
import com.cdmu.utils.ResultInfoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * 文件下载
 *
 * @author BenOniShi
 * @date 2020/4/21 23:41
 */
@RequestMapping("/download")
@Controller
public class DownloadController {

    @Autowired
    private ResultInfoUtil resultInfoUtil;
    @Autowired
    private IArticleService articleService;

    /**
     * @param page restful
     * @return
     */
    @RequestMapping(value = "{page}", method = RequestMethod.GET)
    public ModelAndView page(@PathVariable String page) {
        ModelAndView modelAndView = new ModelAndView();
        switch (page) {
            case "manager-list":
                modelAndView.setViewName("related-download/download-manager-list");
                break;
            case "manager-add":
                modelAndView.setViewName("related-download/download-manager-add");
                break;
            default:
                break;
        }
        return modelAndView;
    }

}
