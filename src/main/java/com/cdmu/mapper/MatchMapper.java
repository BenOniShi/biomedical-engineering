package com.cdmu.mapper;

import com.cdmu.pojo.Match;
import com.cdmu.pojo.MatchExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MatchMapper {
    long countByExample(MatchExample example);

    int deleteByExample(MatchExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Match record);

    int insertSelective(Match record);

    List<Match> selectByExample(MatchExample example);

    Match selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Match record, @Param("example") MatchExample example);

    int updateByExample(@Param("record") Match record, @Param("example") MatchExample example);

    int updateByPrimaryKeySelective(Match record);

    int updateByPrimaryKey(Match record);
}