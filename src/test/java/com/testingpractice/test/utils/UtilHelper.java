package com.testingpractice.test.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilHelper {
	static int timeOut =60;
	public static void waitforElementVisible(WebDriver driver, WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	public static String getPlaceholderName(WebDriver driver, WebElement element){
		return element.getAttribute("aria-label");
	}

	
	   public void selectOptionFromADropDown(WebDriver driver, String dropDownName, String optionToBeSelected) throws Exception {
			try {
			    WebElement webElement = driver.findElement(By.xpath("//select[@name = '" + dropDownName + "']"));
			    Select webElementToSelect = new Select(webElement);
			    webElementToSelect.selectByVisibleText(optionToBeSelected);
			} catch (Exception e) {
			    throw new Exception("Error in Selecting Option from a Drop Down");
			}
		    }
	   
	   public static String getText(WebDriver driver, WebElement element){
			return element.getText();
		}
	   
	   
}

