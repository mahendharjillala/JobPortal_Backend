package com.sunless.JobPort.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerAspect.class);

    // returnType class-path.method(arguments)

    @Before("execution(* com.sunless.JobPort.service.JobService.*(..))")
    public void logMethodBefore(JoinPoint jp) {
        LOGGER.info("Before " + jp.getSignature().getName());
    }
    @After("execution(* com.sunless.JobPort.service.JobService.*(..))")
    public void logMethodAfter(JoinPoint jp) {
        LOGGER.info("After " + jp.getSignature().getName());
    }
    @AfterThrowing("execution(* com.sunless.JobPort.service.JobService.*(..))")
    public void logMethodCooked(JoinPoint jp) {
        LOGGER.info("Cooked " + jp.getSignature().getName());
    }
    @AfterReturning("execution(* com.sunless.JobPort.service.JobService.*(..))")
    public void logMethodSuccess(JoinPoint jp) {
        LOGGER.info("Success " + jp.getSignature().getName());
    }

}
