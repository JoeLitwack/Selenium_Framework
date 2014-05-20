package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SamplePageOne {

	private WebDriver driver;
	
	public SamplePageOne(WebDriver d) {
		this.driver = d;
		if("pageTitle".equals(driver.getTitle())) 
			throw new IllegalStateException("This is not page one!");
	}
	
	// elements 
	@FindBy
	WebElement button; // default by name or ID?
	
	@FindBy(name ="elementName")
	WebElement text;		// text by name 
	
}
