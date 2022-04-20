package com.zj.j2eehomework.zuoye12;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    @Before("execution(* com.zj.j2eehomework.zuoye12.Student.*(..))")
    public void myBefore(JoinPoint joinPoint){System.out.println("myBefore---"+joinPoint.getSignature().getName());}
    @After("execution(* com.zj.j2eehomework.zuoye12.Student.*(..))")
    public void myAfter(JoinPoint joinPoint){System.out.println("myAfter---"+joinPoint.getSignature().getName());}

}

