package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANIKANDAN\\eclipse-workspace\\Selenium_Operations\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.automationtesting.in/Windows.html");
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		WebElement lkg = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		lkg.click();
		
		WebElement mop = driver.findElement(By.xpath("//button[text()='click ']"));
		mop.click();
		
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("manikandan98@gmail.com");
		
		
	}

}
