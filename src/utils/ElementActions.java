package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.goldstar.main.Base;

public class ElementActions {
	
	public static boolean isElementVisible(WebDriver driver, By locator) {
		boolean result;
		try {
			result = driver.findElement(locator).isDisplayed();
		} catch(Exception e) {
			result = false;
		}
		return result;
	}
	
	
	public static boolean waitForElementVisible(WebDriver driver, By locator) {
        return waitForElementVisible(driver, locator, Base.MAX_WAIT);
    }

    public static boolean waitForElementVisible(WebDriver driver, By locator, int timeOut) {
    	WebDriverWait wait = new WebDriverWait(driver, timeOut/1000); // in seconds
    	boolean result; 
    
    	try {
    		result = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)) != null ? true:false;
    	} catch(org.openqa.selenium.TimeoutException e) {
    		result = false;
    	}
    		return result;
    }
	


}
