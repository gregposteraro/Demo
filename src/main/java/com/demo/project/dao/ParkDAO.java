package com.demo.project.dao;

import java.util.List;

import javax.sql.DataSource;

import com.demo.project.model.Park;
import com.demo.project.model.User;

public interface ParkDAO {
	
	   public void setDataSource(DataSource ds);
	   /** 
	    * This is the method to be used to create
	    * a record in the Student table.
	    */
	   public void create(Park park);
	   
	   public List<Park> getPark();

}
