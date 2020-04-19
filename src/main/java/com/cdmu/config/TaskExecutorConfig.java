package com.cdmu.config;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @Author: BenOnSHI
 * @Date: 2020/3/16 15:16
 **/
@Configuration
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer {

    /**
     * @description: 实现AsyncConfigurer接口并重写getAsyncExecutor方法，
     * 并返回一个ThreadPoolTaskExecutor，这样我们就获得了一个基于线程池TaskExecutor
     * @param:
     * @return: java.util.concurrent.Executor
     * @author: benOnShi
     * @date: 2020/1/17
     **/
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(10);
        taskExecutor.setMaxPoolSize(80);
        taskExecutor.setQueueCapacity(100);
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }

}
