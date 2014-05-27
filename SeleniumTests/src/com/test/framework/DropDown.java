package com.test.framework;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class DropDown {
	
	/**
	 * This class provides methods for interacting with Drop down menu objects 
	 * @param driver WebDriver object
	 * @param element WebElement object 
	 * @param object return page object 
	 * @param textValue text to locate drop down option 
	 */
	public DropDown(WebDriver driver, WebElement element, Object pageObject, String textValue ) {}


    public Object interactDropdown(WebDriver driver, WebElement element, Object pageObject, String textValue) {
    	Select select = new Select(element);
    	select.selectByVisibleText(textValue);
    	return pageObject;
	}
}