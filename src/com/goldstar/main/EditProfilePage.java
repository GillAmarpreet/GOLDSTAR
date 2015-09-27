package com.goldstar.main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.ElementActions;
import static utils.DriverActions.click;
import static utils.DriverActions.type;

public class EditProfilePage {
	private WebDriver driver;
	
	private By website = By.id("account_website");
	private By updateSettingsButton = By.cssSelector("input[class='button large blue']");
	private By cBox = By.id("cboxTopLeft");

	public EditProfilePage(WebDriver driver) {
		this.driver = driver;
		ElementActions.waitForElementVisible(driver, website);
	}

	public boolean isPageLoaded() {
		return ElementActions.isElementVisible(driver, website);
	}
	
	public void enterWebsite(String text) {
		type(driver, website, text);
	}
	
	public void clickUpdateSettingsButton() {
		click(driver, updateSettingsButton);
	}
	
	public By getSuccessMsgLocator() {
		return cBox;
	}



}
