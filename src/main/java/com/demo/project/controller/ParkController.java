package com.demo.project.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.dao.ParkDAO;
import com.demo.project.model.Park;

@RestController
@RequestMapping(value = "park")
public class ParkController {

	private ParkDAO dao;
	private ApplicationContext context;
	
	@PostConstruct
	public void init() {
		context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		dao = (ParkDAO) context.getBean("ParkDAO");
	}
	
	@RequestMapping(value = "getParks")
	@ResponseBody
	public List<Park> getParks(){
		
		
		return dao.getPark();
	}
	
}
