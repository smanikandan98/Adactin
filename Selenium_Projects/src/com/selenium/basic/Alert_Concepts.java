package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Concepts {
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANIKANDAN\\eclipse-workspace\\Selenium_Projects\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
	 
		 WebElement simple = driver.findElement(By.xpath("(//button[contains(@class, 'btn ')])[1]"));
		 simple.click();
		 Thread.sleep(2000);
		 
		 driver.switchTo().alert().accept();
		 Thread.sleep(2000);
		 
		 
		 WebElement confirm = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
		 confirm.click();
		 Thread.sleep(2000);
		 
		 driver.switchTo().alert().accept();
		 Thread.sleep(2000);
		 
		 WebElement prompt = driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
		 prompt.click();
		 Thread.sleep(2000);
		 
		 driver.switchTo().alert().sendKeys("MANI");
		 driver.switchTo().alert().accept();
		 
	}

}
