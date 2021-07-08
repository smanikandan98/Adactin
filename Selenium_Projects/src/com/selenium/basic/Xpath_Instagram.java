package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Instagram {
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANIKANDAN\\eclipse-workspace\\Selenium_Projects\\Drivers\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.instagram.com/?hl=en");
		 driver.manage().window().maximize();
		 
		 WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		 username.sendKeys("m.msd7");
		 
		
		 
	}

}
