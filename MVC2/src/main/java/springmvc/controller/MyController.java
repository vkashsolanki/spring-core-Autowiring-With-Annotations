package springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class MyController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		System.out.println("Value is : : "+name+email+mobile);
		
		
		
		System.out.println("hi..............");
		ModelAndView modelAndView = new ModelAndView("my");
		//modelAndView.setView(null);
		modelAndView.addObject("name", name);
		modelAndView.addObject("email", email);
		modelAndView.addObject("mobile", mobile);
		System.out.println("hi2..............");
		
		return modelAndView;
	}

}
