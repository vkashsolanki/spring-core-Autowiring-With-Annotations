package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.EmpDao;
import com.model.Employee;

@Controller
public class EmpController {
	
	@Autowired
	private EmpDao dao;
	
	@GetMapping(value = "/")
	public String index()
	{
		return "index";
	}
	
	
	@PostMapping(value = "/registerurl")
	public String register(@ModelAttribute Employee employee, Model model)
	{
		int dataSave = dao.dataSave(employee);
		System.out.println("registeration page here"+dataSave);
		return "index";
		
	}
	
	@PostMapping(value = "/login")
	public String login(@ModelAttribute Employee employee, Model model)
	{
		
		Employee employee2 = dao.get(employee.getId());
		model.addAttribute("emp" , employee2);
		return "hi";
	}
	
	@GetMapping(value = "logui")
	public String logui()
	{
		return "hi";
		
	}
	
	@GetMapping(value = "registerui")
	public String regui()
	{
		return "register";
		
	}


	public EmpDao getDao() {
		return dao;
	}


	public void setDao(EmpDao dao) {
		this.dao = dao;
	}
	
	
	

}
