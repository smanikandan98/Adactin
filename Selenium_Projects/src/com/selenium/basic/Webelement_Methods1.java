package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Methods1 {
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANIKANDAN\\eclipse-workspace\\Selenium_Projects\\Drivers\\chromedriver.exe");
		 
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		 WebElement email = driver.findElement(By.id("email"));
		 email.sendKeys("m.msd7");
		 
		 //isEnabled
		 boolean enabled = email.isEnabled();
         System.out.println("Enabled or not : " +  enabled);
         
         //isDisplayed
		 boolean displayed = email.isDisplayed();
		 System.out.println("Displayed or not :" + displayed);
		 
		 //getAttribute
		 String attribute = email.getAttribute("value");
		 System.out.println("PAssed attribute value is :" + attribute);
		 
		 //getAttribute
		 String attribute2 = email.getAttribute("id");
		 System.out.println("Passed id value is :" + attribute2);
		 
	}

}
