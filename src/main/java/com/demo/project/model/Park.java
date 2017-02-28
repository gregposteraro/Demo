package com.demo.project.model;

public class Park {

	private String parkName;
	private String longitude;
	private String latitude;
	private String dateEstablished;
	private String parkArea;
	private Integer parkVisitors;
	private String parkDescription;
	
	public Park(String parkName, String parkLocation, String dateEstablished, String parkArea, Integer parkVisitors, String parkDescription) {
		this.parkName = parkName;
		this.longitude = longitude;
		this.latitude = latitude;
		this.dateEstablished = dateEstablished;
		this.parkArea = parkArea;
		this.parkVisitors = parkVisitors;
		this.parkDescription = parkDescription;
	}
	public Park() {

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
	public String getDateEstablished() {
		return dateEstablished;
	}
	public void setDateEstablished(String dateEstablished) {
		this.dateEstablished = dateEstablished;
	}
	public String getParkArea() {
		return parkArea;
	}
	public void setParkArea(String parkArea) {
		this.parkArea = parkArea;
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

