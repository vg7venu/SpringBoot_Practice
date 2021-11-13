package com.springboot.aopexample;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAspect {
    private Logger log = LoggerFactory.getLogger(UserAspect.class);

    @Before("execution(* com.springboot.aopexample.business.*.*(..))")
    public void before(JoinPoint joinPoint) {
        log.info("Intercept before the call {}", joinPoint);
    }
}
