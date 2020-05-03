package com.cdmu.controller;

import com.cdmu.model.ResultInfo;
import com.cdmu.pojo.Article;
import com.cdmu.pojo.Match;
import com.cdmu.service.IArticleService;
import com.cdmu.utils.ResultInfoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * 文章
 *
 * @Author: BenOnSHI
 * @Date: 2020/4/21 16:37
 **/
@RequestMapping("/article")
@Controller
public class ArticleController {

    @Autowired
    private IArticleService articleService;
    @Autowired
    private ResultInfoUtil resultInfoUtil;

    /**
     * @param page restful
     * @return
     */
    @RequestMapping(value = "{page}", method = RequestMethod.GET)
    public ModelAndView page(@PathVariable String page) {
        ModelAndView modelAndView = new ModelAndView();
        switch (page) {
            case "list":
                modelAndView.setViewName("article-list/article-list");
                break;
            case "manager-list":
                modelAndView.setViewName("article-list/article-manager-list");
                break;
            case "manager-add":
                modelAndView.setViewName("article-list/article-manager-add");
                break;

            default:
                break;
        }
        return modelAndView;
    }



    @RequestMapping(value = "queryArticleByParams/{articleAttributes}",method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo queryArticleByParams(@RequestParam(defaultValue = "0") Integer page
            , @RequestParam(defaultValue = "100") Integer limit, Article article,@PathVariable String articleAttributes){
        return resultInfoUtil.success(articleService.queryArticleByParams(page,limit,article,articleAttributes));
    }

    /**
     * 文章添加
     *
     * @param article 文章bean
     * @return
     */
    @RequestMapping(value = "/addArticle", method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo addNews(Article article) {
        articleService.addArticleByType(article);
        return resultInfoUtil.success();
    }

    @RequestMapping(value = "/deleteArticle/{articleId}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResultInfo deleteArticleByArticleId(@PathVariable Integer articleId) {
        articleService.deleteArticleByArticleId(articleId);
        return resultInfoUtil.success();
    }


}
