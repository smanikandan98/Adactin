package com.maven.testng.TestNg;

import org.testng.annotations.Test;

public class TimeOut {
	
	
	
	
	
	@Test (timeOut = 5000)
	
	private void series() throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println("Spartacus Series");
	}

}
