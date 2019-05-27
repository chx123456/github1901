package com.qfedu.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/qfedu/ioc/applicationContext.xml");
		/*
		User user2 = (User) context.getBean("user2");
		System.out.println(user2.getAge());
		System.out.println(user2.getName());
	*/
		
		/*User user3 = (User) context.getBean("user3");
		System.out.println(user3.getAge());
		System.out.println(user3.getName());*/
		
		
		/*
		 * User user4 = (User) context.getBean("user4");
		 * System.out.println(user4.getName()); System.out.println(user4.getAge());
		 */
		
		/*User user5 = (User) context.getBean("user5");
		System.out.println(user5.getName());
		System.out.println(user5.getAge());*/
		
		User user6 = (User) context.getBean("user6");
		System.out.println(user6.getAge());
		System.out.println(user6.getName());
		
		
		
	}

}
