package com.qzx.aop;

import org.aspectj.lang.ProceedingJoinPoint;


public class MyAdvice {
	public void myBefore() {
		System.out.println("before advice");
	}

	public void myAfter() {
		System.out.println("after advice");
	}

	public void myArround(ProceedingJoinPoint p) throws Throwable {
		System.out.println("before advice2");
		p.proceed();
		System.out.println("after advice2");
	}

}
