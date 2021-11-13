package com.springboot.aopexample;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect // aspect = pointcut and advice
@Configuration
public class UserAspect {
    private Logger log = LoggerFactory.getLogger(UserAspect.class);

    // Weaving = defining the aspect around the code
    // Weaver = framework which implements is called i.e AOP is the framework
    @Before("execution(* com.springboot.aopexample.business.*.*(..))") // this is pointcut
    public void before(JoinPoint joinPoint) {
        log.info("Intercept before the call {}", joinPoint); // this is advice
    }
}
