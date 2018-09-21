package com.javacodegeeks.testng.maven.mavendemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class NewTest {
	public static WebDriver driver ; 
	 
	@BeforeClass
	public void beforeClass() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/home/nadsoft34/Desktop/sel/chromedriver");
//		System.setProperty("webdriver.chrome.driver", "/home/nadsoft34/Desktop/sel/chromedriver");
		driver = new ChromeDriver();  
		
		driver.manage().window().maximize();
//		driver.get("https://www.contractoros.net/wp-content/plugins/registration-process/logs/registration-18-09-12.log");
		driver.get("http://www.google.com");
	}
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		Thread.sleep(1000);
	}	

	@AfterMethod
	public void afterMethod() throws InterruptedException 
	{
		Thread.sleep(1000);
	}

	@Test
	public void actions() throws InterruptedException
	{
		System.out.println("Hi test jenkins....."); 
	
	}
}
