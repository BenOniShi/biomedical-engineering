package com.cdmu.pojo.vo;


import java.util.Map;

/**
 * 返回前台的模块封装
 *
 * @author BenOniShi
 * @date 2019/12/22 16:06
 */
public class ModulesInfo {
    /**
     * clearInfo  清除模块
     * homeInfo   主页模块
     * logoInfo 登录 标题  头像
     * menuInfo 菜单模块
     */
    private Modules clearInfo;
    private Modules homeInfo;
    private Modules logoInfo;
    private Map<String, Modules> menuInfo;

    public Modules getClearInfo() {
        return clearInfo;
    }

    public void setClearInfo(Modules clearInfo) {
        this.clearInfo = clearInfo;
    }

    public Modules getHomeInfo() {
        return homeInfo;
    }

    public void setHomeInfo(Modules homeInfo) {
        this.homeInfo = homeInfo;
    }

    public Modules getLogoInfo() {
        return logoInfo;
    }

    public void setLogoInfo(Modules logoInfo) {
        this.logoInfo = logoInfo;
    }

    public Map<String, Modules> getMenuInfo() {
        return menuInfo;
    }

    public void setMenuInfo(Map<String, Modules> menuInfo) {
        this.menuInfo = menuInfo;
    }
}
