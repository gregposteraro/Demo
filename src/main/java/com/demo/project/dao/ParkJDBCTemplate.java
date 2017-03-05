package com.demo.project.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.demo.project.model.Park;
import com.demo.project.model.User;

public class ParkJDBCTemplate implements ParkDAO{
	
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplateObject;
	   
	
	
	@Override
	public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(Park park) {
	      String SQL = "insert into parks (name, country, province, latitude, longitude, dtEst, parkArea, annualVisitors) values (?,?,?,?,?,?,?,?);";
	      
	      jdbcTemplateObject.update( SQL, park.getParkName(), park.getCountry(), park.getProvince(), park.getLatitude(), park.getLongitude(), park.getDateEstablished(), park.getParkArea(), park.getParkVisitors());
	}

	
	@Override
	public List<Park> getPark(){
		String SQL = "select * from parks";
		Park park;
		List<Park> rows = jdbcTemplateObject.query(SQL, new ParksRowMapper());

		return rows;

	}
}
final class ParksRowMapper implements RowMapper<Park>
{
  public Park mapRow(ResultSet rs, int rowNum)
  throws SQLException 
  {
    Park park = new Park();
    park.setParkName( rs.getString("name") );
    park.setLongitude( rs.getString("longitude") );
    park.setLatitude( rs.getString("latitude") );
    park.setDateEstablished(rs.getDate("dtEst"));
    park.setProvince(rs.getString("province"));
    park.setCountry(rs.getString("country"));
    park.setParkVisitors(rs.getInt("annualVisitors"));
    park.setParkArea(rs.getInt("parkArea"));
    
    return park;
  }
}
