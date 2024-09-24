package springmvc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;



@Controller
public class MyController{


	
	@RequestMapping(value = "/hathi" , method = RequestMethod.POST)
	public ModelAndView getpage(HttpServletRequest request, HttpServletResponse response)
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
		
		
		
		// create connection and set data in mysql
		
		final String DB_URL = "jdbc:mysql://localhost:3306/test";
		final String USER = "root";
		final String PASS = "root";
		
		
		Connection connection;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("Inserting records into the table ..."+connection);
			
			String query = "insert into user(name, email, mobile) value(?,?,?)";
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, mobile);
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		return modelAndView;
	}

}
