package com.cdmu.service;

import com.cdmu.pojo.Match;
import com.github.pagehelper.PageInfo;

/**
 * @author BenOniShi
 * @date 2020/5/2 21:22
 */
public interface IMatchService {
    void addMatch(Match match);

    PageInfo queryMatchByParams(Integer page, Integer limit, Match match);

    void deleteMatchById(Integer id);

    PageInfo queryMatchByType(String matchType);

    Match queryMatchById(Integer matchId);

    void updateMatch(Integer id, Match match);
}
