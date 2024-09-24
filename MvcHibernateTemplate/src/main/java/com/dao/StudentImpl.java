package com.dao;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.entities.Student;

public class StudentImpl implements StudentDao{
	@Autowired
	HibernateTemplate hibernateTemplate;

	public int insert(Student student) {
		
		return (Integer) hibernateTemplate.save(student);
		
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	
	
	

}
