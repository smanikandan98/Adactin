package com.selenium.org;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Concepts {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANIKANDAN\\eclipse-workspace\\Selenium_Operations\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.navigate().to("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		Thread.sleep(2000);
		
		WebElement gmail = driver.findElement(By.xpath("//a[@class='gb_f']"));
		Actions ac = new Actions(driver);
		ac.contextClick(gmail).build().perform();
		
		
		Robot rc = new Robot();
		rc.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		rc.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		rc.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

	}

}
