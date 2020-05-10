package com.cdmu.constant;

/**
 * @author BenOniShi
 * @date 2020/5/10 22:34
 */
public enum ArticleEnum {
    //新闻动态
    NEWS_ARTICLE("新闻动态"),
    FILE_ARTICLE("相关文件"),
    PROMPT_ARTICLE("重点提示");


    private final String articleType;

    ArticleEnum(String articleType) {
        this.articleType = articleType;
    }

    public String getArticleType() {
        return articleType;
    }


}

