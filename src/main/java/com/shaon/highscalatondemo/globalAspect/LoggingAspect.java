package com.shaon.highscalatondemo.globalAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

//    Logger logger = LoggerFactory.



    @Before("execution(* com.shaon.highscalatondemo..*.*(..))")
    public void logBeforeMethod(JoinPoint joinPoint) {
        System.out.println("Executing: " + joinPoint.getSignature().toShortString());
    }

    @AfterReturning(pointcut = "execution(* com.shaon.highscalatondemo..*.*(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("Completed: " + joinPoint.getSignature().toShortString() + " with result: " + result);
    }
}
