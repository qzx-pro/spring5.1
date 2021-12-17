package com.qzx.proxy.cglib;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;
	}

	public int multi(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		assert b != 0;
		return a / b;
	}
}
