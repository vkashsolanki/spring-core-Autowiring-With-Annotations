package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.StudentDao;
import com.entities.Student;

@Controller
public class HomeController {
	
	StudentDao dao;
	
	@RequestMapping("/")
	public String login()
	{
	
		return "register";
		
	}
	
	@RequestMapping("/login")
	public String datainsert(@ModelAttribute Student student, Model model)
	{
		
		int insert = dao.insert(student);
		model.addAttribute("st", insert);
		return "login";
	}

}
