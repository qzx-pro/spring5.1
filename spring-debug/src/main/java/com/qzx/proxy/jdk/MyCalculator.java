package com.qzx.proxy.jdk;

public class MyCalculator implements Calculator {
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int minus(int a, int b) {
		return a - b;
	}

	@Override
	public int multi(int a, int b) {
		return a * b;
	}

	@Override
	public int div(int a, int b) {
		assert b != 0;
		return a / b;
	}
}
