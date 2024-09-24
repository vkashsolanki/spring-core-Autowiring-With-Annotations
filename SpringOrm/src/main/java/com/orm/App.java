package com.orm;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.orm.entity.Employee;
 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        Resource resource = new ClassPathResource("com/orm/applicationContext.xml");
//        BeanFactory beanFactory = new XmlBeanFactory(resource);
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/orm/applicationContext.xml");
        
        
        
        EmployeeDao bean = (EmployeeDao) context.getBean("empdao");
        
        Employee employee = new Employee();
        employee.setId(2000);
        employee.setName("Ram");
        employee.setEmail("ram@gmail.com");
        employee.setMobile("4578457845");
        
        bean.savee(employee);
        
    }
}
