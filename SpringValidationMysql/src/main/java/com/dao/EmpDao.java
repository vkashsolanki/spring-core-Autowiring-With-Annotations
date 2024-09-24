package com.dao;

import com.model.Employee;

public interface EmpDao {
	
	public int dataSave(Employee employee);
	public Employee get(int id);

}
