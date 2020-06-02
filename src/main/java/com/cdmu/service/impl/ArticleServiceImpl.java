package com.cdmu.service.impl;

import com.cdmu.mapper.ArticleMapper;
import com.cdmu.pojo.Article;
import com.cdmu.pojo.ArticleExample;
import com.cdmu.service.IArticleService;
import com.cdmu.utils.AssertsUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author BenOniShi
 * @date 2020/5/1 20:32
 */
@Service
public class ArticleServiceImpl implements IArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public PageInfo queryArticleByParams(Integer page, Integer limit, Article article, String articleAttributes) {
        ArticleExample articleExample = new ArticleExample();
        ArticleExample.Criteria criteria = articleExample.createCriteria();
        criteria.andArticleAttributesEqualTo(articleAttributes);
        PageHelper.startPage(page, limit);
        return new PageInfo(articleMapper.selectByExampleWithBLOBs(articleExample));
    }

    @Override
    public void addArticleByType(Article article) {
        AssertsUtils.isTrue(0 == articleMapper.insertSelective(article), "文章保存失败,请稍后再试！");
    }


    @Override
    public void deleteArticleByArticleId(Integer articleId) {
        AssertsUtils.isTrue(0 == articleMapper.deleteByPrimaryKey(articleId)
                , "抱歉，文章删除失败，请重试！");
    }

    @Override
    public PageInfo queryArticleByType(Integer page, Integer limit, String articleType) {
        ArticleExample articleExample = new ArticleExample();
        articleExample.createCriteria().andArticleTypeEqualTo(articleType);
        PageHelper.startPage(page, limit);
        List<Article> articles = articleMapper.selectByExample(articleExample);
        return new PageInfo(articles);
    }

    @Override
    public Article queryArticleById(Integer articleId) {
        return articleMapper.selectByPrimaryKey(articleId);
    }

    @Override
    public void updateArticle(Integer id, Article article) {
        article.setId(id);
        articleMapper.updateByPrimaryKeyWithBLOBs(article);
    }
}
