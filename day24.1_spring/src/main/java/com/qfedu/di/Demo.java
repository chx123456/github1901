package com.qfedu.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/qfedu/di/applicationContext.xml");
		
		UserController controller = (UserController) context.getBean("userController2");
		
		controller.addUser();
		
	}

}
