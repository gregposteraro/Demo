package com.demo.project.model;

import java.util.Date;

public class Park {

	private String parkName;
	private String longitude;
	private String latitude;
	private Date dateEstablished;
	private Integer parkArea;
	private Integer parkVisitors;
	private String parkDescription;
	

	public Park() {

	}
	
	
	
	public Date getDateEstablished() {
		return dateEstablished;
	}



	public void setDateEstablished(Date dateEstablished) {
		this.dateEstablished = dateEstablished;
	}



	public Integer getParkArea() {
		return parkArea;
	}



	public void setParkArea(Integer parkArea) {
		this.parkArea = parkArea;
	}



	public String getParkName() {
		return parkName;
	}
	public void setParkName(String parkName) {
		this.parkName = parkName;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	public Integer getParkVisitors() {
		return parkVisitors;
	}
	public void setParkVisitors(Integer parkVisitors) {
		this.parkVisitors = parkVisitors;
	}
	public String getParkDescription() {
		return parkDescription;
	}
	public void setParkDescription(String parkDescription) {
		this.parkDescription = parkDescription;
	}

}

