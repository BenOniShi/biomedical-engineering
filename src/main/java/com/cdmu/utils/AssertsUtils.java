package com.cdmu.utils;


import com.cdmu.exceptions.ParamsException;

/**
 * 判断  if   true
 * 抛出 一个自定义的参数异常
 *
 * @author BenOniShi
 * @date 2019/12/12 15:40
 */
public final class AssertsUtils {

    /**
     *
     * @param flag  flag是真，抛出异常
     * @param msg   抛出的异常消息
     */
    public static void isTrue(boolean flag, String msg) {
        if (flag) {
            throw new ParamsException(msg);
        }

    }

    /**
     *
     * @param flag flag是真，抛出异常
     */
    public static void isTrue(boolean flag) {
        if (flag) {
            throw new ParamsException();
        }

    }

    /**
     *
     * @param flag flag是真，抛出异常
     * @param code 异常的code码
     * @param msg  异常的消息
     */
    public static void isTrue(boolean flag, Integer code, String msg) {
        if (flag) {
            throw new ParamsException(code, msg);
        }

    }


}
