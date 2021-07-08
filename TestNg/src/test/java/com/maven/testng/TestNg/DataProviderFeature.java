package com.maven.testng.TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderFeature {
	
	
	@Test(dataProvider = "testData")
	
	private void credentials(String username, String password) {
		System.out.println("Username=" +username);
		System.out.println("Password=" +password);
		
		
	}
	
	@DataProvider
	private Object[][] testData() {
		
		return new Object[][] {
			{"Mani","12345"},
			{"Deepak","67890"},
			{"Ajay","2345"},
			{"Saran","1111"}
		};	
}

}
