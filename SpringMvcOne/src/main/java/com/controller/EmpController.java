package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {
	
	@RequestMapping("/ram")
	public String display()
	
	{
		String s= "Honest is the best policy";
		System.out.println(s);
		
		return s;
		
		
		
	}

}
