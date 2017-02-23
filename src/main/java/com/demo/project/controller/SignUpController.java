package com.demo.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.dao.UserDAO;
import com.demo.project.model.User;

@RestController
@RequestMapping(value = "signUpLogin")
public class SignUpController {

	@Value("#{UserJDBCTemplate}")
	private UserDAO dao;
//	@RequestMapping(value = "/onSignUp", method = RequestMethod.POST)
//	ResponseEntity<?> onSignUp() {
//
//		System.out.println("In the Controller");
//		
//		
//		ResponseEntity response = null;
//		return response;
//	}
	
	@RequestMapping(value = "onSignUp", method = RequestMethod.POST)
	String onSignUp(HttpServletRequest request,
            HttpServletResponse response, Model model) {

		System.out.println("In the Controller");
		System.out.println(request.getParameterMap().keySet());
		System.out.println(request.getParameterMap().values());
		
		
		System.out.println(request.getParameter("firstName"));
		
		User newUser = new User();
		newUser.setFirstName(request.getParameter("firstName"));
		newUser.setLastName(request.getParameter("lastName"));
		newUser.setEmail(request.getParameter("email"));
		newUser.setPassword(request.getParameter("password"));
		
		dao.create(newUser);
		
		return "This is the Return String";
	}

}
