package com.cdmu.controller;

import com.cdmu.model.ResultInfo;
import com.cdmu.pojo.Match;
import com.cdmu.service.IMatchService;
import com.cdmu.utils.ResultInfoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author BenOniShi
 * @date 2020/5/2 20:52
 */
@RequestMapping("/competition")
@Controller
public class CompetitionController {

    @Autowired
    private IMatchService matchService;
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
            case "manager-list":
                modelAndView.setViewName("competition/competition-manager-list");
                break;
            case "manager-add":
                modelAndView.setViewName("competition/competition-manager-add");
                break;

            default:
                break;
        }
        return modelAndView;
    }

    /**
     * 后台竞赛信息管理列表
     *
     * @param page
     * @param limit
     * @param match
     * @return
     */
    @RequestMapping(value = "/queryMatchByParams", method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo queryMatchByParams(@RequestParam(defaultValue = "0") Integer page
            , @RequestParam(defaultValue = "100") Integer limit, Match match) {
        return resultInfoUtil.success(matchService.queryMatchByParams(page, limit, match));
    }


    /**
     * 竞赛信息添加
     *
     * @param match
     * @return
     */
    @RequestMapping(value = "/addMatch", method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo addMatch(Match match) {
        matchService.addMatch(match);
        return resultInfoUtil.success();
    }

    @RequestMapping(value = "/deleteMatchById/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResultInfo deleteMatchById(@PathVariable Integer id) {
        matchService.deleteMatchById(id);
        return resultInfoUtil.success();
    }

    /**
     * 页面竞赛信息
     *
     * @param matchType
     * @return
     */
    @RequestMapping(value = "/queryMatchByType", method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo queryMatchByType(String matchType) {
        return resultInfoUtil.success(matchService.queryMatchByType(matchType));
    }

    @RequestMapping(value = "queryMatch", method = RequestMethod.GET)
    public ModelAndView queryArticle(Integer matchId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("match", matchService.queryMatchById(matchId));
        modelAndView.setViewName("competition/competition-match-list");
        return modelAndView;
    }


}
