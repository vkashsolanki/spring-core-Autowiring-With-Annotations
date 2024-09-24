package com.test.WithoutXmlSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigJava {


//	@Bean(name = "student")
//	public Student getStudent()
//	{
//		Student s= new Student();
//		s.getId();
//		s.getName();	
//		return s;
//	}
	
	@Bean
	public Student sstudent()
	{

		return new Student();
		
	}
	
//	public void display()
//	{
//		this.student().getId();
//		this.student().getName();
//	}
	

}
