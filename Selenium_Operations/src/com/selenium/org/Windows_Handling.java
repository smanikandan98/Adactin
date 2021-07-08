package com.selenium.org;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handling {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANIKANDAN\\eclipse-workspace\\Selenium_Operations\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.navigate().to("http://demo.automationtesting.in/Windows.html");
	
	String pId = driver.getWindowHandle();
	System.out.println(pId);
	
	
	WebElement parent = driver.findElement(By.xpath("//button[text()='    click   ']"));
	parent.click();
	
	
	Set<String> mani = driver.getWindowHandles();
	
	for (String suba : mani) {
		
		String title = driver.switchTo().window(suba).getTitle();
		System.out.println(title);
		
	if (driver.switchTo().window(suba).getTitle().equals("Frames & windows")) {
	driver.close();
	
	}
		
	
		
		
		
	}
	
		
	

	
	}

}
