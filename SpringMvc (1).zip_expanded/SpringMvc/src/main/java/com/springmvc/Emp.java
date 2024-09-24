package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Emp
{
@RequestMapping("/")	
public String display(Model model)
{

	model.addAttribute("message", "Vikash Solanki From Delhi");
	
	return "index";
}
}
