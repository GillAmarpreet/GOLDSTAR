package com.goldstar.main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.ElementActions;
import static utils.DriverActions.click;
import static utils.DriverActions.type;

public class PaymentPage extends ProfileTab {
	private WebDriver driver;


	public PaymentPage(WebDriver driver) {
		this.driver = driver;
		//ElementActions.waitForElementVisible(driver, emailHistoryCopy);
	}




}
