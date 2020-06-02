package com.cdmu.service.impl;

import com.cdmu.constant.MatchStateEnum;
import com.cdmu.mapper.MatchMapper;
import com.cdmu.pojo.Match;
import com.cdmu.pojo.MatchExample;
import com.cdmu.service.IMatchService;
import com.cdmu.utils.AssertsUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author BenOniShi
 * @date 2020/5/2 21:23
 */
@Service
public class MatchServiceImpl implements IMatchService {

    @Autowired
    private MatchMapper matchMapper;

    @Override
    public void addMatch(Match match) {
        match.setMatchState(MatchStateEnum.sing_up.getName());
        AssertsUtils.isTrue(0 == matchMapper.insertSelective(match)
                , "竞赛信息添加失败，请稍后再试");
    }

    @Override
    public PageInfo queryMatchByParams(Integer page, Integer limit, Match match) {
        MatchExample matchExample = new MatchExample();
        MatchExample.Criteria criteria = matchExample.createCriteria();
        PageHelper.startPage(page, limit);
        return new PageInfo(matchMapper.selectByExample(matchExample));
    }

    @Override
    public void deleteMatchById(Integer id) {
        AssertsUtils.isTrue(0 == matchMapper.deleteByPrimaryKey(id)
                , "竞赛信息删除失败，请稍后再试！");
    }

    @Override
    public PageInfo queryMatchByType(String matchType) {
        MatchExample matchExample = new MatchExample();
        matchExample.createCriteria().andMatchTypeEqualTo(matchType);
        PageHelper.startPage(0, 5);
        return new PageInfo(matchMapper.selectByExample(matchExample));
    }

    @Override
    public Match queryMatchById(Integer matchId) {
        return matchMapper.selectByPrimaryKey(matchId);
    }

    @Override
    public void updateMatch(Integer id, Match match) {
        match.setId(id);
        matchMapper.updateByPrimaryKeySelective(match);
    }
}
