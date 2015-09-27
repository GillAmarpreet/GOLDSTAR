package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DriverActions {
	
	public static void type(WebDriver driver, By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}
	
	public static void click(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}
	
	public void scrollDown(WebDriver driver) {
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,200)", "");
	}

}
