package com.goldstar.main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.ElementActions;
import static utils.DriverActions.click;
import static utils.DriverActions.type;

public class EmailHistoryPage extends ProfileTab {
	private WebDriver driver;
	
	//private By emails = By.cssSelector("#email_history > tbody > tr");
	private By emailHistoryCopy = By.cssSelector("#primary > h1");
	


	public EmailHistoryPage(WebDriver driver) {
		this.driver = driver;
		ElementActions.waitForElementVisible(driver, emailHistoryCopy);
	}

	public int getEmailsCount() {
		return driver.findElements(emails).size();
	}




}
