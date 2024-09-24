package com.test.WithoutXmlSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(ConfigJava.class);
    	Student bean = context.getBean("sstudent", Student.class);
    	System.out.println(bean);
    	
    	
    	
    }
}
