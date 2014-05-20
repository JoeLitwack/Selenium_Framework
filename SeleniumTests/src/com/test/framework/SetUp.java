package com.test.framework;


import org.openqa.selenium.firefox.*;
import org.openqa.selenium.*;
import org.testng.annotations.*;


public class SetUp {
	
	public SetUp() {}
	
	private static WebDriver driver;
	
	@BeforeTest
	public void  setUp() {
			driver = new FirefoxDriver();
	}
	
	
	public static WebDriver getDriver() {
		if(driver == null) {
			driver = new FirefoxDriver();
			return driver;
		}
		else {
			return driver;
		}
	}
	
	@AfterTest
	public void quit() {
		driver.quit();
	} 
}
