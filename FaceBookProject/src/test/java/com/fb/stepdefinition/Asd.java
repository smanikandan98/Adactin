package com.fb.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.baseclass.org.Base_Class;
import com.fb.pom.MainPage;
import com.fb.runner.Runner;

import cucumber.api.java.en.*;

public class Asd  extends Base_Class{
	
	public static WebDriver driver = Runner.driver;
	
	MainPage mp = new MainPage(driver);
			

	@Given("^user launches the url of the application$")
	public void user_launches_the_url_of_the_application() throws Throwable {
		url("https://www.facebook.com/");
	    
	}

	@When("^user enters  \"([^\"]*)\" as username$")
	public void user_enters_as_username(String arg1) throws Throwable {
	    
	}

	@When("^user enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String arg1) throws Throwable {
	    
	}

	@When("^user clicks the signin button$")
	public void user_clicks_the_signin_button() throws Throwable {
	   
	}

	@Then("^user validate the login page$")
	public void user_validate_the_login_page() throws Throwable {
	    
	}








	}
