package com.maven.testng.TestNg;

import org.testng.annotations.Test;

public class Assert {
	
	
	@Test
	private void test() {
		String actual = "ABCDE";
		String expected = "abcde";
		
		org.testng.Assert.assertNotNull(actual);
		
		
	}

}
