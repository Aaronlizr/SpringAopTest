package com.myspring.aop.springaop.main;


import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

public class AuthAspect {//该类作为Aspect用

    public void auth(JoinPoint jp){//该类作为Advice用

        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("======模拟检查=======");

    }
}
