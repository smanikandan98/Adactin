package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public WebDriver driver;
	
	
	@FindBy (id = "radiobutton_0")
	private WebElement radio;
	
	public Select_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getProceed() {
		return proceed;
	}

	@FindBy (id = "continue")
	private WebElement proceed;
	

}
