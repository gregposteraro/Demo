package com.demo.project.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.demo.project.model.Park;

public class WikiParkScanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = "";
		    
		    System.out.println(line);
		    
		    
		    ArrayList retArray = new ArrayList();
		    while ((line = br.readLine()) != null) {
		    	Park newPark = new Park();
		    	//set name
		    	//newPark.setParkName(parkName);
		    	System.out.println(line.split(">"));
		    	
		    	
		    	String[] tempArray = line.split(">");
		    	newPark.setParkName(tempArray[4]);
		    	
		    	
		    	
		    	
		    	//read line set state
		    	line = br.readLine();
		    	
		    	
		    	
		        sb.append(line);
		        sb.append(System.lineSeparator());
		    }
		    String everything = sb.toString();
		} finally {
		    br.close();
		}
	}

}
