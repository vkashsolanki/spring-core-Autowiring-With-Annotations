package com.orm;



import org.springframework.orm.hibernate5.HibernateTemplate;

import com.orm.entity.Employee;

public class EmployeeDao {

	HibernateTemplate template;
	
	
	
	
	
	public void savee(Employee employee) {
		this.template.save(employee);
		
	}
	
	public void updatee(Employee employee) {
		this.template.update(employee);
	}
	
		public void deletee(Employee employee) {
			this.template.delete(employee);
		
	}
	


	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	
	
	
}
