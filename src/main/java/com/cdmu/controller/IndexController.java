package com.cdmu.controller;

import com.cdmu.model.ResultInfo;
import com.cdmu.service.IArticleService;
import com.cdmu.service.IModulesService;
import com.cdmu.utils.ResultInfoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: BenOnSHI
 * @Date: 2020/4/19 11:36
 **/
@Controller
@RequestMapping("/index")
public class IndexController {


    @Autowired
    private ResultInfoUtil resultInfoUtil;
    @Autowired
    private IModulesService modulesServiceI;
    @Autowired
    private IArticleService articleService;


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
            case "news":
                modelAndView.addObject("title", "新闻动态");
                modelAndView.setViewName("common-view/common-list");
                break;
            case "download":
                modelAndView.addObject("title", "相关下载");
                modelAndView.setViewName("common-view/common-list");
                break;
            case "file":
                modelAndView.addObject("title", "相关文件");
                modelAndView.setViewName("common-view/common-list");
                break;
            case "process":
                modelAndView.addObject("title", "指南流程");
                modelAndView.setViewName("common-view/common-list");
                break;
            case "problem":
                modelAndView.addObject("title", "常见问题");
                modelAndView.setViewName("common-view/common-list");
                break;
            case "training":
                modelAndView.addObject("title", "科研训练");
                modelAndView.setViewName("common-view/common-list");
                break;
            case "tips":
                modelAndView.addObject("title", "重点提示");
                modelAndView.setViewName("common-view/common-list");
                break;
            case "achievement":
                modelAndView.addObject("title", "成果展示");
                modelAndView.setViewName("common-view/common-list");
                break;
            case "competition":
                modelAndView.addObject("title", "学科竞赛");
                modelAndView.setViewName("competition/competition-list");
                break;
            case "notice":
                modelAndView.addObject("title", "通知公告");
                modelAndView.setViewName("common-view/common-list");
                break;
            default:
                break;
        }
        return modelAndView;
    }

    @RequestMapping(value = "/queryArticleByType", method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo queryArticleByType(@RequestParam(defaultValue = "0") Integer page
            , @RequestParam(defaultValue = "100") Integer limit, String articleType) {
        return resultInfoUtil.success(articleService.queryArticleByType(page, limit, articleType));
    }

    @RequestMapping(value = "queryArticle", method = RequestMethod.GET)
    public ModelAndView queryArticle(Integer articleId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("article", articleService.queryArticleById(articleId));
        modelAndView.setViewName("article-list/article-list");
        return modelAndView;
    }


}
