package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao dao;

	@GetMapping(value = "/")
	public String loginPage() {

		return "login";
	}

	@PostMapping(value = "/registerurl")
	public String registerPage(@ModelAttribute Employee employee, BindingResult result, Model model) {
		if (result.hasErrors()) {
			System.out.println(result);
			return "register";
		}else {

		int i = dao.dataSave(employee);
		System.out.println(i);
		// model.addAttribute("empd", employee);
		return "login";
		}

	}
	
	@GetMapping(value = "registerurl")
	public String ui()
	{
		return "register";
	}
	
	@GetMapping(value = "logui")
	public String logui() {
		return "login";
		
	}

}
