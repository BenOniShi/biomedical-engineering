package com.cdmu.pojo.vo;

import java.util.List;

/**
 * 模块
 *
 * @author BenOniShi
 * @date 2019/12/17 14:18
 */
public class Modules {
    /**
     * title  模块名称
     * href 路径
     * icon 图标
     * target 打开类型
     * child 子模块
     * clearUrl 清楚路径
     */
    private String title;
    private String href;
    private String icon;
    private String target;
    private List<Modules> child;
    private String clearUrl;
    private String image;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public List<Modules> getChild() {
        return child;
    }

    public void setChild(List<Modules> child) {
        this.child = child;
    }

    public String getClearUrl() {
        return clearUrl;
    }

    public void setClearUrl(String clearUrl) {
        this.clearUrl = clearUrl;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Modules{" +
                "title='" + title + '\'' +
                ", href='" + href + '\'' +
                ", icon='" + icon + '\'' +
                ", target='" + target + '\'' +
                ", child=" + child +
                ", clearUrl='" + clearUrl + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}

