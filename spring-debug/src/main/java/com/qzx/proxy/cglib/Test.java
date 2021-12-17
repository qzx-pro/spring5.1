package com.qzx.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class Test {
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(Calculator.class);
		enhancer.setCallback(new MyCglib());
		Calculator calculator = (Calculator) enhancer.create();
		System.out.println(calculator.add(1, 1));
	}
}
