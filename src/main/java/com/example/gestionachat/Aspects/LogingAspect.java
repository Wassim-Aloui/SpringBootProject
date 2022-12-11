package com.example.gestionachat.Aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LogingAspect {

    @Before("execution(* com.example.gestionachat.Services.stockServiceImp.add(..))")
    public void logMethodEntry(JoinPoint jp) {


        String name = jp.getSignature().getName();
        log.info("In method : " + name);

    }
}
