package com.how2java.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Author hongjy
 * @Date 2021/7/24
 * @Description
 **/

// 面向切面编程。。

@Aspect
@Component
public class LoggerAspect {
    // 方法上直接可以抛出异常的写法 有什么用？？
    @Around(value = "execution(* com.how2java.service.ProductService.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("start log: " + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("end log: " + joinPoint.getSignature().getName());
        return  object;
    }
}
