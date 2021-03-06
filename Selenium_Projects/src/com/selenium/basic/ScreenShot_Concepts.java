package com.selenium.basic;

import java.io.File;
import java.io.IOException;
import java.nio.file.attribute.FileAttribute;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.html5.Utils;

public class ScreenShot_Concepts {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANIKANDAN\\eclipse-workspace\\Selenium_Projects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File mani = ts.getScreenshotAs(OutputType.FILE);
		
		File suba = new File("C:\\Users\\MANIKANDAN\\eclipse-workspace\\Selenium_Projects\\Screenshot\\img1.png");
		
		FileUtils.copyFileToDirectory(mani, suba);
		
		
		
		
	}

}
