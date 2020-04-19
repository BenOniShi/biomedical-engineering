package com.cdmu.utils;

import com.cdmu.model.ResultInfo;
import org.springframework.stereotype.Component;

/**
 * @author BenOniShi
 * @date 2019/12/14 17:10
 */
@Component
public final class ResultInfoUtil {

    /**
     * @return 默认成功
     */
    public ResultInfo success() {
        ResultInfo resultInfo = new ResultInfo();
        return resultInfo;
    }

    /**
     * @param code code码
     * @return 返回code
     */
    public ResultInfo success(Integer code) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(code);
        return resultInfo;
    }

    /**
     * @param msg 消息
     * @return 返回msg
     */
    public ResultInfo success(String msg) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setMsg(msg);
        return resultInfo;
    }


    /**
     * @param result
     * @return 返回结果集
     */
    public ResultInfo success(Object result) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setData(result);
        return resultInfo;
    }

    /**
     * @param code code码
     * @param msg  消息
     * @return 返回code 和msg
     */
    public ResultInfo success(Integer code, String msg) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(code);
        resultInfo.setMsg(msg);
        return resultInfo;
    }


    /**
     * @param code   code
     * @param result 结果集
     * @return 返回 code   结果集
     */
    public ResultInfo success(Integer code, Object result) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(code);
        resultInfo.setData(result);
        return resultInfo;
    }

    /**
     * @param msg    msg
     * @param result 结果集
     * @return 返回 code   结果集
     */
    public ResultInfo success(String msg, Object result) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setMsg(msg);
        resultInfo.setData(result);
        return resultInfo;
    }

    /**
     * @param code   code
     * @param msg    msg
     * @param result 结果集
     * @return 返回 code  msg  结果集
     */
    public ResultInfo success(Integer code, String msg, Object result) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(code);
        resultInfo.setMsg(msg);
        resultInfo.setData(result);
        return resultInfo;
    }
}
