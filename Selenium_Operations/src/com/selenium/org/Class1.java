package com.selenium.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class1 {
	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANIKANDAN\\eclipse-workspace\\Selenium_Operations\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com/index.php");
		
		
	WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
	signIn.click();
	//Thread.sleep(2000);
	
	WebElement email = driver.findElement(By.xpath("//input[@id='email_create']"));
	email.sendKeys("shaaaannnn.manikandan98@gmail.com");
	//Thread.sleep(2000);
	
	WebElement click = driver.findElement(By.xpath("//i[@class='icon-user left']"));
	click.click();
	//Thread.sleep(2000);
	
	WebElement mr = driver.findElement(By.xpath("//input[@name='id_gender']"));
	mr.click();
	//Thread.sleep(2000);
	
	WebElement firstName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	firstName.sendKeys("Manikandan");
	//Thread.sleep(2000);
	
	WebElement lastNmae = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	lastNmae.sendKeys("Shanmugam");
	//Thread.sleep(2000);
	
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("Mani1001");
	//Thread.sleep(2000);
	
	WebElement date = driver.findElement(By.id("days"));
	Select s = new Select(date);
	s.selectByValue("10");
	//Thread.sleep(2000);
	
	WebElement month = driver.findElement(By.id("months"));
	Select s1 = new Select(month);
	s1.selectByValue("1");
	//Thread.sleep(2000);
	
	WebElement years = driver.findElement(By.id("years"));
	Select s2 = new Select(years);
	s2.selectByValue("1998");
	//Thread.sleep(2000);
	
	WebElement checkBox1 = driver.findElement(By.id("newsletter"));
	checkBox1.click();
	//Thread.sleep(2000);
	
	WebElement checker = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	checker.click();
	//Thread.sleep(2000);
	
	WebElement adress1 = driver.findElement(By.id("address1"));
	adress1.sendKeys("1583 Arockiya Nagar");
	//Thread.sleep(2000);
	
	WebElement city = driver.findElement(By.id("city"));
	city.sendKeys("Thanjavur");
	//Thread.sleep(2000);
	
	WebElement state = driver.findElement(By.id("id_state"));
	Select s3 = new Select(state);
	s3.selectByValue("14");
	//Thread.sleep(2000);
	
	WebElement postal = driver.findElement(By.id("postcode"));
	postal.sendKeys("32207");
	//Thread.sleep(2000);
	
	WebElement country = driver.findElement(By.id("id_country"));
	Select s4 = new Select(country);
	s4.selectByValue("21");
	//Thread.sleep(2000);
	
	WebElement mobile = driver.findElement(By.id("phone_mobile"));
	mobile.sendKeys("7094368399");
	//Thread.sleep(2000);
	
	WebElement register = driver.findElement(By.id("submitAccount"));
	register.click();
	//Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
