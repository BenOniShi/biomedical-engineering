package com.cdmu.constant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: BenOniShi
 * @Date: 2020/1/2 14:32
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultObj {

    private Integer code;
    private String msg;

    public static final ResultObj LOGIN_SUCCESS = new ResultObj(ResultConstant.SUCCESS_CODE, "登陆成功");
    public static final ResultObj LOGIN_ERROR_PASS = new ResultObj(ResultConstant.FAILED_CODE, "登陆失败,用户名或密码不正确");

    public static final ResultObj UPDATE_SUCCESS = new ResultObj(ResultConstant.SUCCESS_CODE, "更新成功");
    public static final ResultObj UPDATE_ERROR = new ResultObj(ResultConstant.FAILED_CODE, "更新失败");

    public static final ResultObj ADD_SUCCESS = new ResultObj(ResultConstant.SUCCESS_CODE, "添加成功");
    public static final ResultObj ADD_ERROR = new ResultObj(ResultConstant.FAILED_CODE, "添加失败");

    public static final ResultObj DELETE_SUCCESS = new ResultObj(ResultConstant.SUCCESS_CODE, "删除成功");
    public static final ResultObj DELETE_ERROR = new ResultObj(ResultConstant.FAILED_CODE, "删除失败");

    public static final ResultObj RESET_SUCCESS = new ResultObj(ResultConstant.SUCCESS_CODE, "重置成功");
    public static final ResultObj RESET_ERROR = new ResultObj(ResultConstant.FAILED_CODE, "重置失败");

    public static final ResultObj DISPATCH_SUCCESS = new ResultObj(ResultConstant.SUCCESS_CODE, "分配成功");
    public static final ResultObj DISPATCH_ERROR = new ResultObj(ResultConstant.FAILED_CODE, "分配失败");

    public static final ResultObj OPERATE_SUCCESS = new ResultObj(ResultConstant.SUCCESS_CODE, "操作成功");
    public static final ResultObj OPERATE_ERROR = new ResultObj(ResultConstant.FAILED_CODE, "操作失败");

}

