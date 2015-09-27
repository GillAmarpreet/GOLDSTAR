package com.goldstar.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementActions;
import static utils.DriverActions.click;
import static utils.DriverActions.type;

public class CompleteYourProfilePopUpPage {
	private WebDriver driver;
	
	private By fullName = By.cssSelector("#signup_name");
	private By createYourProfileButton = By.cssSelector("#signup_profile");


	public CompleteYourProfilePopUpPage(WebDriver driver) {
		this.driver = driver;
		ElementActions.waitForElementVisible(driver, fullName);
	}
	
	public void enterFullName(String text) {
		type(driver, fullName, text);
	}
	
	public HomePage clickCreateYourProfileButton() {
		click(driver, createYourProfileButton);
		return new HomePage(driver);
	}
	


}
