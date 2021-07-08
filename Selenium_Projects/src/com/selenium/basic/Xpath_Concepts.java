package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Concepts {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANIKANDAN\\eclipse-workspace\\Selenium_Projects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
	    username.sendKeys("shan.manikandan98@gmail.com");
	    Thread.sleep(3000);
	    
	    WebElement password = driver.findElement(By.xpath("(//input[contains(@class, 'inputtext')])[2]"));
	    password.sendKeys("mnbvcxz");
	    Thread.sleep(3000);
	    
	    WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
	    login.click();
	}

}

