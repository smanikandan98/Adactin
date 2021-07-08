package com.selenium.org;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handling1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANIKANDAN\\eclipse-workspace\\Selenium_Operations\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.navigate().to("http://demo.automationtesting.in/Windows.html");
	
	String mnb = driver.getWindowHandle();
	System.out.println(mnb);
	
	WebElement vcx = driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']"));
	vcx.click();
	
	WebElement lkj = driver.findElement(By.xpath("//button[text()='click']"));
	lkj.click();
	
	
	Set<String> mop = driver.getWindowHandles();
	
	for (String string : mop) {
		
		String string2 = driver.switchTo().window(string).getTitle();
		System.out.println(string2);
		
		
		if (driver.switchTo().window(string).getTitle().equals("Frames & windows")) {
			driver.close();
		}
		
		
	}
	
	

	


	}
}