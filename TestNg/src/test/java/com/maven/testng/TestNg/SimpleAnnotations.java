package com.maven.testng.TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {
	
	@BeforeSuite
	private void friend1() {
		System.out.println("ajay");

	}
	@BeforeTest
	private void friend2() {
		System.out.println("deepak");

	}
	@BeforeClass
	private void friend3() {
		System.out.println("saran");

	}
	@BeforeMethod
	private void friend4() {
		System.out.println("ganesh");

	}
	@Test
	private void sister() {
		System.out.println("suba");

	}
	@Test
	private void sis() {
		System.out.println("sujitha");

	}
	
	@Test
	private void akka() {
		System.out.println("pushpa");

	}
	@AfterMethod
	private void friend5() {
		System.out.println("gani");

	}
	@AfterClass
	private void friend6() {
		System.out.println("suriya");

	}
	@AfterTest
	private void friend7() {
		System.out.println("dammy");

	}
	@AfterSuite
	private void friend8() {
		System.out.println("katta");

	}
	
	
	

}
