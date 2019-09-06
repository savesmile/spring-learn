package com.flin.spring.core.aop;

import com.aliyun.openservices.ons.api.bean.ProducerBean;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author F_lin
 * @since 2019/4/15
 **/
@Aspect
@Component
public class TestAspect {

    @Autowired
    ProducerBean producerBean;

    @Before("execution(* com.flin.spring.core.aop.tests.Cat.*(..))")
    public void beforeAspect() {
        System.out.println("前置通知Test....");
    }

}
