package com.example.easynotes.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class TestData {

	@Test
	public void getStatusCode() {
		
		
		
	Response respose =	RestAssured.get("http://localhost:8095/api/notes");
	
	int statusCode = respose.getStatusCode();
	
	System.out.println(statusCode);
	
	//	Assert.assertEquals(statusCode, 200);
		
	}
	
	
	@Test
	public void getBody() {
		
		
		
	Response respose =	RestAssured.get("http://localhost:8095/api/notes");
	
	String data = respose.getBody().asString();
	
	System.out.println(data);
	
		//Assert.assertEquals(statusCode, 200);
		
	}
	
	
	
}
