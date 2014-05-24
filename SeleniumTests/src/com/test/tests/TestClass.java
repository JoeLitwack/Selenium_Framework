package com.test.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.test.pages.SamplePageOne;

public class TestClass {
	
	WebDriver driver;
	
	public TestClass(WebDriver d) {
		this.driver = d;
	}
	
	@Test
	public void test() {
		driver.get("www.google.com");
	SamplePageOne pageOne = new SamplePageOne(driver);
	}

}
