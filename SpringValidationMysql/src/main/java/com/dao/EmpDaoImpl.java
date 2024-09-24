package com.dao;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.model.Employee;

@Component
public class EmpDaoImpl implements EmpDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int dataSave(Employee employee) {
		Integer save = (Integer) hibernateTemplate.save(employee);
		return save;
	}

	public Employee get(int id) {

		Employee employee = hibernateTemplate.get(Employee.class, id);
		return employee;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
