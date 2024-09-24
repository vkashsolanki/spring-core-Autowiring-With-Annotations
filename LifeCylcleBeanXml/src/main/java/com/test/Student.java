package com.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{

	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Init method is starting .......");
		
		
	}

	public void destroy() throws Exception {
		System.out.println("destroy method is ending .........");
		
	}
	
	
	

}
