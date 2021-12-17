package com.qzx.tx.annotation;

import com.qzx.tx.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Config.class);
		context.refresh();
		AccountService service = context.getBean(AccountService.class);
		service.transfer("zhangsan", "lisi", 100);
	}
}
