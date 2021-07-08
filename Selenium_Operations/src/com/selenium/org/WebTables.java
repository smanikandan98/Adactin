package com.selenium.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANIKANDAN\\eclipse-workspace\\Selenium_Operations\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		
		Thread.sleep(3000);
		
		System.out.println("------------ALL DATA-------------");
		List<WebElement> allData = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td"));
		
		for (WebElement data : allData) {
			System.out.println(data.getText());
			
		}
	
		System.out.println("-----------Particular Data-----------");
		List<WebElement> pData = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[3]//td"));
		
		for (WebElement parData : pData) {
			System.out.println(parData.getText());
			
		}
		
		System.out.println("-----------Data At Particular--------");
		List<WebElement> dataEntry = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[3]//td[2]"));
		
		for (WebElement lateEntry : dataEntry) {
			System.out.println(lateEntry.getText());
		}

	
			
		}
	}
		
		
	


