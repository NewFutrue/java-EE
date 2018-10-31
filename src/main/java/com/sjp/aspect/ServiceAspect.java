package com.sjp.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ServiceAspect {


    @AfterReturning("execution(* com.sjp.service.*.*(..))")
    public void fun(JoinPoint jp){
        System.out.println("正常执行"+jp.getSignature().getDeclaringTypeName()+"的"+jp.getSignature().getName()+"方法");
    }

    @AfterThrowing("execution(* com.sjp.service.*.*(..))")
    public void fun2(JoinPoint jp){
        System.out.println("执行"+jp.getSignature().getDeclaringTypeName()+"的"+jp.getSignature().getName()+"方法时，产生异常");
    }

}
