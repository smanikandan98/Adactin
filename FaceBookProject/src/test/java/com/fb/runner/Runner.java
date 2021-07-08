package com.fb.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.org.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\facebook\\org\\FaceBook.feature" , glue = "com\\fb\\stepdefinition\\Asd.java" , monochrome = true)

public class Runner {
	
	public static  WebDriver driver;
	@BeforeClass
	public static void setup() {
		driver = Base_Class.browserLauch("chrome");
	}

	
	
	
	
	

}
