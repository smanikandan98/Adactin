package com.maven.testng.TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	
	@Test
	@Parameters({"username","password","value"})
	private void details(String username, String password, int value) {
		
		System.out.println("username = " +username );
		System.out.println("passwprd ="  +password);
		System.out.println("Number =" +value);
		
		
		
	}
	
	

}
