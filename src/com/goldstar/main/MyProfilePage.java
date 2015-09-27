package com.goldstar.main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.ElementActions;
import static utils.DriverActions.click;
import static utils.DriverActions.type;

public class MyProfilePage {
	private WebDriver driver;
	
	private By editProfile = By.linkText("Edit Profile");
	private By emailHistory = By.cssSelector("#secondary_top_nav > a:nth-child(5)");

	public MyProfilePage(WebDriver driver) {
		this.driver = driver;
		ElementActions.waitForElementVisible(driver, editProfile);
	}

	public boolean isPageLoaded() {
		return ElementActions.isElementVisible(driver, editProfile);
	}
	
	public EditProfilePage clickEditProfile() {
		click(driver, editProfile);
		return new EditProfilePage(driver);
	}
	
	public EmailHistoryPage clickEmailHistory() {
		click(driver, emailHistory);
		return new EmailHistoryPage(driver);
	}



}
