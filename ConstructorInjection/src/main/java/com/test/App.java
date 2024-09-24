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
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/test/applicationContext.xml");
        Student bean = context.getBean("student", Student.class);
        System.out.println(bean);
        
        
        
     //   Student s= new Student(12, "ram,","bihar");
      //  System.out.println(s);
        
        
    }
}
