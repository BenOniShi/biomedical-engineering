package com.cdmu.exceptions;


import com.cdmu.constant.ResultConstant;
import com.cdmu.model.ResultInfo;
import com.cdmu.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author BenOniShi
 * @date 2019/12/12 15:46
 */
@Component
public class GloblExceptionResolver implements HandlerExceptionResolver {

    private static Logger logger = LoggerFactory.getLogger(GloblExceptionResolver.class);

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        /**
         * 判断方法级别是否存在responsebody
         *
         *              根据ex对象判断具体的异常类型
         * 1.视图转发异常
         *      默认的错误视图 （错误消息  code -》 msg）
         * 2.json响应异常
         *      {
         *          code：300
         *          msg：XXX
         *      }
         */
        /*
        handler 是否属于 HandlerMethod
         */
        //获取默认视图方法 getDefaultModelAndView
        ModelAndView mv = getModelAndView(ex);
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            //返回ResponseBody 注解对象
            ResponseBody responseBody = handlerMethod.getMethod().getAnnotation(ResponseBody.class);
            if (null == responseBody) {
                //responseBody为空   没有 responseBody 注解  就是视图异常
                //如果异常属于ParamsException 参数异常
                if (ex instanceof ParamsException) {
                    ParamsException pe = (ParamsException) ex;
                    mv.addObject("code", pe.getCode());
                    mv.addObject("msg", pe.getMsg());
                }
                return mv;
            } else {
                //json异常 创建一个resultInfo 对象
                ResultInfo resultInfo = new ResultInfo();
                //设置默认的 code 和msg
                resultInfo.setCode(ResultConstant.FAILED_CODE);
                resultInfo.setMsg("网络繁忙,请稍后再试");
                //如果异常属于 自定义的 ParamsException 异常
                if (ex instanceof ParamsException) {
                    ParamsException pe = (ParamsException) ex;
                    //获取 ParamsException 中的code 和msg
                    resultInfo.setCode(pe.getCode());
                    resultInfo.setMsg(pe.getMsg());
                }
                PrintWriter writer = null;
                response.setCharacterEncoding("utf-8");
                response.setContentType("application/json;charset=utf-8");
                try {
                    //获取打印流
                    writer = response.getWriter();
                    //输出resultInfo 对象
                    writer.write(JsonUtil.object2JsonStr(resultInfo));
                    writer.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (null != writer) {
                        writer.close();
                    }
                }
            }
            return null;
        } else {
            return mv;
        }
    }

    /**
     * 返回一个默认的错误视图界面
     *
     * @param e 异常
     * @return ModelAndView
     */
    public ModelAndView getModelAndView(Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", e.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
