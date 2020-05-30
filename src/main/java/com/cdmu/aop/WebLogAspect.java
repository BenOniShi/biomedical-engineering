package com.cdmu.aop;

import com.cdmu.annotation.LoggerAnnotation;
import com.cdmu.controller.BaseController;
import com.cdmu.service.ILogService;
import com.cdmu.utils.JsonUtil;
import com.cdmu.utils.SessionUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 日志处理切面类
 *
 * @author BenOniShi
 * @date 2019/12/13 16:17
 */
@Aspect
@Component
public class WebLogAspect extends BaseController {


    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private Environment env;
    @Autowired
    private ILogService logService;

    private Logger logger = LoggerFactory.getLogger(com.cdmu.aop.WebLogAspect.class);


    @Pointcut("@annotation(com.cdmu.annotation.LoggerAnnotation)")
    public void LoggerAnnotationCut() {
    }

    @Around(value = "LoggerAnnotationCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        LoggerAnnotation annotation = methodSignature.getMethod().getAnnotation(LoggerAnnotation.class);
        Object proceed = null;
        if (null != annotation) {
            proceed = joinPoint.proceed();

        }
        /**
         * 写入日志表
         */
        return proceed;
    }
}
