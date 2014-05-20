package com.test.framework;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Button {

	
	/**
	 * Constructor for the Element class providing element state variables 
	 * @param d WebDriver object 
	 * @param e	WebElement object 
	 * @param t	String element type 
	 */
	public Button(WebDriver driver, WebElement element, Class<?> object) {
		clickButton(driver, element, object);
	}
	
	public Class<?> clickButton(WebDriver driver, WebElement element, Class<?> c) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		return c;
	}
}
