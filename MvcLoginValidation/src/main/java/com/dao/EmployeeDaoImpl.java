package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional
	public int dataSave(Employee employee) {

		return (Integer) this.hibernateTemplate.save(employee);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
