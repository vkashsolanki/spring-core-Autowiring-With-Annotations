package com.man;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.context.ContextProvider;
import com.dao.StudentDao;
import com.entity.Student;

public class Client {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = ContextProvider.provideContext();
		StudentDao dao = context.getBean("stDao", StudentDao.class);
		
		// insert data
		
		Student student = new Student(100, "ram hare");
		dao.insert(student);
		
		// update single data
		Student student2 = dao.getStudent(100);
		student2.setName("ShreeKrishan");
		dao.update(student2);
		
		//get single data
		
		Student student3 = dao.getStudent(100);
		System.out.println(student3);
		
		// get all data 
		
		List<Student> allStudents = dao.getAllStudents();
		for(Student student4 : allStudents) {
			System.out.println(student4);
		}
		
		// delete data
		
		dao.delete(121);
		
		
		
	}

}
