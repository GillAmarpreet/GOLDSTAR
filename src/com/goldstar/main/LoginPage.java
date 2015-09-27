package com.goldstar.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementActions;
import static utils.DriverActions.click;
import static utils.DriverActions.type;

public class LoginPage {
	private WebDriver driver;
	
	private By email = By.cssSelector("#email");
	private By password = By.cssSelector("#password");
	private By loginButton = By.cssSelector("input[class='button large blue']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		ElementActions.waitForElementVisible(driver, email);
	}
	
	public LoginPage(WebDriver driver, String url) {
		this.driver = driver;
		driver.get(url);
		ElementActions.waitForElementVisible(driver, email);
	}
	
	public void enterUserName(String text) {
		type(driver, email, text);
	}
	
	public void enterPassword(String text) {
		type(driver, password, text);
	}
	
	public HomePage clickLogin() {
		click(driver, loginButton);
		return new HomePage(driver);
	}
	
	public boolean isPageLoaded() {
		return ElementActions.isElementVisible(driver, email);
	}
	

}
