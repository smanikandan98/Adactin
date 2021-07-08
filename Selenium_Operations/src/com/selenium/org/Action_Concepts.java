package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Concepts {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANIKANDAN\\eclipse-workspace\\Selenium_Operations\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		Thread.sleep(2000);
		
		
		WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(courses).build().perform();
		
		
		WebElement software = driver.findElement(By.xpath("//a[text()='Software Testing Training ']"));
		ac.moveToElement(software).build().perform();
		
		WebElement selenium = driver.findElement(By.xpath("//a[text()='Selenium Training']"));
		ac.click(selenium).build().perform();
		
		
		
		
		
		
	}
	

}
