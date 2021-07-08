package com.selenium.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Class2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANIKANDAN\\eclipse-workspace\\Selenium_Operations\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com/index.php");
		WebElement logIn = driver.findElement(By.xpath("//a[@class='login']"));
		logIn.click();
		WebElement signin = driver.findElement(By.id("email"));
		signin.sendKeys("manisince98@gmail.com");
		WebElement passwd = driver.findElement(By.id("passwd"));
		passwd.sendKeys("mani1001");
		WebElement signIn = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		signIn.click();
		Actions act = new Actions(driver);
		WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		dress.click();
		WebElement casual = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[3]"));
		casual.click();
		WebElement printed = driver.findElement(By.xpath("//img[@alt='Printed Dress']"));
		printed.click();
		WebElement going = driver.findElement(By.className("fancybox-iframe"));
		driver.switchTo().frame(going);
		WebElement quantity = driver.findElement(By.className("icon-plus"));
		quantity.click();
		quantity.click();
		WebElement size = driver.findElement(By.id("group_1"));
		Select s0 = new Select(size);
		s0.selectByValue("2");
		WebElement proceed = driver.findElement(By.xpath("//button[@name='Submit']"));
		proceed.click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click(); 
		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
		driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
