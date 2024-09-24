package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    ApplicationContext context = new ClassPathXmlApplicationContext("com/test/hathi.xml");	
    Employee employee = (Employee)context.getBean("employee", Employee.class);
    
 
    System.out.println(employee);
    
    	
    	
    }
}
