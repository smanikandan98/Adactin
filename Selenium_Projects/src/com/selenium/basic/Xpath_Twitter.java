package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Twitter {
	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://twitter.com/LOGIN");
		driver.manage().window().maximize();
		

	}

}

