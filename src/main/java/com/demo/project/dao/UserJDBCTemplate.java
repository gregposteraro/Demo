package com.demo.project.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.project.model.User;

@Repository
public class UserJDBCTemplate implements UserDAO {

	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplateObject;
	   
	
	
	@Override
	public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(User user) {
	      String SQL = "insert into users (uid, password) values (?,?);";
	      
	      jdbcTemplateObject.update( SQL, user.getFirstName(), user.getPassword());
	}


	
}
