package com.test.SpringWithAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Address bean = (Address) context.getBean("ram");
        bean.setCity("Mumbai");
        bean.setState("Maharastra");
        System.out.println(bean);
        
//        Student st = (Student) context.getBean("ram");
//        Address add = new Address();
//        add.setCity("Mumbai");
//        add.setState("Maharastra");
//        System.out.println(st);
//    
        		
       

     
    }
}
