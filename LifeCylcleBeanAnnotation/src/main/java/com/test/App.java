package com.test;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws Exception {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/test/config.xml");
		Student bean = context.getBean("student", Student.class);
		System.out.println(bean);
		context.registerShutdownHook();

	}
}
