package com.demo.project.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.demo.project.model.Park;

public class WikiParkScanner {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("E:/development/projects/Demo/src/main/resources/data/USNationalParks.txt"));
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = "";
		    String[] lineArray;
		    
		    Park park = new Park();
		    
		    
		    
		    ArrayList<Park> retArray = new ArrayList<Park>();
		    while ((line = br.readLine()) != null) {
		    	park = new Park();
			    System.out.println(line);
			    lineArray = line.split(">");
			    printArryStrings(lineArray);
			    
			    line = br.readLine();
			    System.out.println(line);
			    lineArray = line.split(">"); //2 Acadia
			    park.setParkName(lineArray[2].substring(0, lineArray[2].indexOf('<')));
			    printArryStrings(lineArray);
			    
			    line = br.readLine();
			    System.out.println(line);
			    lineArray = line.split(">");
			    printArryStrings(lineArray);
			    
			    line = br.readLine();
			    System.out.println(line); //2 Maine
			    lineArray = line.split(">");
			    park.setProvince(lineArray[2].substring(0, lineArray[2].indexOf('<')));
			    printArryStrings(lineArray);
			    
			    line = br.readLine(); //19: "44.35, -68.21"
			    System.out.println(line);
			    lineArray = line.split(">");
			    printArryStrings(lineArray);
			    park.setLatitude(lineArray[19].substring(0, 5));
			    park.setLongitude(lineArray[19].substring(7, lineArray[19].indexOf('<')));
			    
			    
			    line = br.readLine(); //4 February 26th, 1919
			    System.out.println(line);
			    lineArray = line.split(">");
			    printArryStrings(lineArray);
			    park.setDateEstablished(stringToDate(lineArray[4].substring(0, lineArray[4].indexOf('<'))));
			    
			    line = br.readLine();
			    System.out.println(line); //3 347,389 acres '('
			    lineArray = line.split(">");
			    printArryStrings(lineArray);
			    park.setParkArea(NumberFormat.getNumberInstance(java.util.Locale.US).parse(lineArray[3].substring(0, lineArray[3].indexOf('a')-1)).intValue());
			    
			    line = br.readLine();
			    System.out.println(line); // 1 3,303,393 <
			    lineArray = line.split(">");
			    printArryStrings(lineArray);
			    park.setParkVisitors(NumberFormat.getNumberInstance(java.util.Locale.US).parse(lineArray[1].substring(0, lineArray[1].indexOf('<'))).intValue());
			    
			    line = br.readLine(); //skip for now
			    System.out.println(line);
			    lineArray = line.split(">");
			    printArryStrings(lineArray);
			    
			    line = br.readLine();
			    System.out.println(line);
			    lineArray = line.split(">");
			    printArryStrings(lineArray);
			    
			  

		    
			    retArray.add(park);
		    }
		   
		    for(Park p: retArray){
		    	System.out.println("Insert into parks(name, country, province, latitude, longitude, dtEst, parkArea, annualVisitors)" + "VALUES('"+ p.getParkName()+"',"+ "'United States','"+p.getProvince() +"','"+ p.getLatitude()+"','" + p.getLongitude() + "','" +  dateToString(p.getDateEstablished()) + "'," + p.getParkArea() +","+ p.getParkVisitors()+");");
		    	//System.out.println();
		    }
		} finally {
		    br.close();
		}
	}
	
	private static void printArryStrings(String[] array){
	
    	for(int i = 0; i < array.length; i++){
    		System.out.println("["+i +"]: "+ array[i]);
    	}
	}

	private static String dateToString(Date d){
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
		return df.format(d);

	}
	
	
	private static Date stringToDate(String startDateString){
	    DateFormat df = new SimpleDateFormat("MMM d, yyyy"); 
	    Date startDate = new Date();
	    try {
	        startDate = df.parse(startDateString);
	        String newDateString = df.format(startDate);
	        System.out.println(newDateString);
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
	    return startDate;
	}
	
}
