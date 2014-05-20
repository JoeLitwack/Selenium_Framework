package com.test.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	
	WebDriver driver;
	
	
	public WaitHelper(WebDriver d) {
		this.driver = d;
	}
	
	
	public void waitForElement(WebElement vElement) {
		WebDriverWait waitForElement = new WebDriverWait(driver, 30);
		waitForElement.until(ExpectedConditions.visibilityOf(vElement));
	}
}
