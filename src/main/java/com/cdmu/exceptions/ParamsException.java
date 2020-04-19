package com.cdmu.exceptions;


import com.cdmu.constant.ResultConstant;

/**
 * 自定义异常类
 *
 * @author BenOniShi
 * @date 2019/12/12 14:41
 */
public class ParamsException extends RuntimeException {

    private Integer code = ResultConstant.FAILED_CODE;
    private String msg = ResultConstant.FAILED_MSG;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public ParamsException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public ParamsException(Integer code) {
        super(ResultConstant.FAILED_MSG);
        this.code = code;
    }

    public ParamsException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public ParamsException() {
        super(ResultConstant.FAILED_MSG);
    }


}
