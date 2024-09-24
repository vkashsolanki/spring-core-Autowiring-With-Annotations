package com.dao;

import java.util.List;



import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Student;

public class StudentDaoImpl implements StudentDao{
	
	private HibernateTemplate template;
	
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
		@Override
		@Transactional
		public int insert(Student s) {
			return (int)  template.save(s);
					
		}
		@Transactional
		public void delete(int id) {
			Student s =template.get(Student.class, id);
			template.delete(s);
			
			
		}
		@Transactional
		public void delete(Student s) {
			template.delete(s);

			
		}
		@Transactional
		public void update(Student s) {
			template.update(s);
			
		}

		public Student getStudent(int id) {
			
			return template.get(Student.class, id);
		}

		public List<Student> getAllStudents() {
			
			return template.loadAll(Student.class);
		}
	
		
	}

	

