package com.stepdefinition;

import java.sql.Connection;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class Sample {
public static void main(String[] args) {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String username = "hr";
	String password = "cheese";
	Connection connection = null;
	

	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection = DriverManager.getConnection(url, username, password);
		String sql = "select * from adactin where TESTCASE_NUM = 'TC_1'";
		PreparedStatement ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			String testCaseNo = rs.getString("TESTCASE_NUM");
			String userName = rs.getString("USER_NAME");
			String passWord = rs.getString("PASSWORD");
			String location = rs.getString("LOCATION");
			String hotels = rs.getString("HOTELS");
			String roomType = rs.getString("ROOM_TYPE");
			String numberOfRooms = rs.getString("NUMBER_OF_ROOMS");
		    Date checkIn = rs.getDate("CHECK_IN_DATE");
		    Date checkOut = rs.getDate("CHECK_OUT_DATE");
		    String adultsPerRoom = rs.getString("ADULTS_PER_ROOM");
		    String childrenPerRoom = rs.getString("CHILDREN_PER_ROOM");
		    String firstName = rs.getString("FIRST_NAME");
		    String lastName = rs.getString("LAST_NAME");
		    String address = rs.getString("BILLING_ADDRESS");
		    long ccNum = rs.getLong("CREDIT_CARD_NUM");	    
		    String ccType = rs.getString("CREDIT_CARD_TYPE");
		    String expMonth = rs.getString("EXPIRY_MONTH");
		    int expYear = rs.getInt("EXPIRY_YEAR");
		    int cVV = rs.getInt("CVV_NUM");
		    
		    
		    
		    SimpleDateFormat dateFormat =new SimpleDateFormat("dd/MM/yyyy");
		    String checInFormat = dateFormat.format(checkIn);
		    
		    SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
		    String checkOutFormat = dateFormat2.format(checkOut);
		    
		    System.out.println(testCaseNo);
		    System.out.println(userName);
		    System.out.println(passWord);
		    System.out.println(location);
		    System.out.println(hotels);
		    System.out.println(roomType);
		    System.out.println(numberOfRooms);
		    System.out.println(checInFormat);
		    System.out.println(checkOutFormat);
		    System.out.println(adultsPerRoom);
		    System.out.println(childrenPerRoom);
		    System.out.println(firstName);
		    System.out.println(lastName);
		    System.out.println(address);
		    System.out.println(ccNum);
		    System.out.println(ccType);
		    System.out.println(expMonth);
		    System.out.println(expYear);
		    System.out.println(cVV);
				
		}
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	
	

	
	
}
}
