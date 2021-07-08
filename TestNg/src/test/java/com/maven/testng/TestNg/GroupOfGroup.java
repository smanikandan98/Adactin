package com.maven.testng.TestNg;

import org.testng.annotations.Test;

public class GroupOfGroup {
	

	@Test (groups = "Social")
	private void insta() {
		System.out.println("Instagram");
	}
	@Test (groups = "Mani")
	private void whatsapp() {
		System.out.println("WHatsapp");

}
}
	
	
