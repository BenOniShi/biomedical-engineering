package com.cdmu.annotation;

import java.lang.annotation.*;

/**
 * @author BenOniShi
 * @date 2020/2/28 21:54
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoggerAnnotation {


    Logger modelName();

    enum Logger {
        //用户
        login_model("登录模块", "登录系统");


        private String modelName;
        private String methodName;


        public String getModelName() {
            return modelName;
        }

        public String getMethodName() {
            return methodName;
        }

        private Logger(String modelName, String methodName) {
            this.modelName = modelName;
            this.methodName = methodName;
        }

    }
}
