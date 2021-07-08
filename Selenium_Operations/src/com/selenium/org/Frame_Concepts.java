package com.selenium.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Concepts {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\MANIKANDAN\\eclipse-workspace\\Selenium_Operations\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		WebElement single = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(single);
		
		WebElement send = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		send.sendKeys("MAni");
		
		WebElement click2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		click2.click();
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(innerframe);
		
		WebElement input = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		input.sendKeys("Mani");
		
		driver.quit();
		
	}

}
