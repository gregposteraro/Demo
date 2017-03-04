package com.demo.project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.model.Park;

@RestController
@RequestMapping(value = "park")
public class ParkController {

	@RequestMapping(value = "getParks")
	public List<Park> getParks(){
		
		
		return null;
	}
	
}
