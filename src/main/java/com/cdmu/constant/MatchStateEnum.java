package com.cdmu.constant;

/**
 * @author BenOniShi
 * @date 2020/6/3 1:03
 */
public enum MatchStateEnum {
    sing_up("报名中"),
    get_on("进行中"),
    end("已结束");


    private String name;


    public String getName() {
        return name;
    }

    MatchStateEnum(String name) {
        this.name = name;
    }
}
