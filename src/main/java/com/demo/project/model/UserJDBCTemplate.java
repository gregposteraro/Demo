package com.demo.project.model;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.project.dao.UserDAO;

@Repository
public class UserJDBCTemplate implements UserDAO {

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplateObject;
	   
	@Override
	public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public void create(User user) {
	      String SQL = "insert into users (uid, password) values (?,?);";
	      
	      jdbcTemplateObject.update( SQL, user.getFirstName(), user.getPassword());
	}


	
}
