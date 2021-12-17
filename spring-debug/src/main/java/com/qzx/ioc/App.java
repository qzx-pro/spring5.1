package com.qzx.ioc;

import com.qzx.tx.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// 用我们的配置文件来启动一个 ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
//		Demo bean = context.getBean(Demo.class);
//		bean.demo1();
		AccountService accountService = (AccountService) context.getBean("accountService");
		accountService.transfer("zhangsan", "lisi", 100);
	}
}
