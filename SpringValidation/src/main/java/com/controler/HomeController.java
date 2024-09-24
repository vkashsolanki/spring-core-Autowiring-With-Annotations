package com.controler;

import javax.validation.Valid;

import org.hibernate.validator.internal.util.privilegedactions.NewInstance;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Employee;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public String dip(Model m)
	{
		m.addAttribute("emp", new Employee());
		return "viewpage";
	}
	 @RequestMapping("/helloagain")  
	public String sform(@Valid @ModelAttribute("emp") Employee e, BindingResult result)
	{
	if(result.hasErrors())
	{
		return "viewpage";
	}else
		
	{
		
	}
	
		return "final";
	}
	
	
	

}
