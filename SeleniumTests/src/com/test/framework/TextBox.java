package com.test.framework;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;


public class TextBox {
	
	/**
	 * This class provides methods to interact with text objects
	 * @param driver WebDriver object 
	 * @param element WebElement object 
	 * @param object page object needed for a return value 
	 * @param vText text value needed to enter into a text field
	 */
	public TextBox(WebDriver driver, WebElement element, Class<?> object, String vText) {
		interactText(driver, element, object, vText); 
	}
	
	private Class<?> interactText(WebDriver driver, WebElement element, Class<?> object, String vText) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.clear();
		element.sendKeys(vText);
		return object;
	}
	
}
