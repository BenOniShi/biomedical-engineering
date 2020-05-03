package com.cdmu.service;

import com.cdmu.pojo.Article;
import com.github.pagehelper.PageInfo;

/**
 * @author BenOniShi
 * @date 2020/5/1 20:32
 */
public interface IArticleService {

    PageInfo queryArticleByParams(Integer page, Integer limit, Article article,String articleAttributes);

    void addArticleByType(Article article);

    void deleteArticleByArticleId(Integer articleId);

    PageInfo queryArticleByType(Integer page,Integer limit,String articleType);

    Article queryArticleById(Integer articleId);
}
