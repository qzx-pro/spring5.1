package com.qzx.proxy.jdk;

public class Test {
	public static void main(String[] args) {
		Calculator proxy = CalculatorProxy.getProxy(new MyCalculator());
		System.out.println(proxy.add(1, 2));

	}
}
