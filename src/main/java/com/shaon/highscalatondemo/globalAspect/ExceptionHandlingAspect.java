package com.shaon.highscalatondemo.globalAspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExceptionHandlingAspect {

    @AfterThrowing(pointcut = "execution(* com.shaon.highscalatondemo..*.*(..))", throwing = "exception")
    public void handleException(Exception exception) {
        System.err.println("Exception caught: " + exception.getMessage());
        // You can log the exception or perform other actions here
    }
}

