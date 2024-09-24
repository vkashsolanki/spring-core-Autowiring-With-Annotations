package com.test.AutowiringParactice;

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
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/test/AutowiringParactice/config.xml");
        Student bean = applicationContext.getBean("student", Student.class);
        System.out.println(bean);
        
        
       
    }
}
