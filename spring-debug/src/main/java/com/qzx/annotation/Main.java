package com.qzx.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(MyConfiguration.class);
		ac.refresh();
		UserService bean = ac.getBean(UserService.class);

	}
}
