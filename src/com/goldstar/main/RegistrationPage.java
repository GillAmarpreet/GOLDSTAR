package com.goldstar.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementActions;
import static utils.DriverActions.click;
import static utils.DriverActions.type;

public class RegistrationPage {
	private WebDriver driver;
	
	private By memberLogin = By.cssSelector("div[class='fb-copy'] a[class='button large white-blue']");
	private By email = By.id("signup_email");
	private By zipCode = By.id("signup_postal_code");
	private By password = By.id("signup_password");
	private By signUpButton = By.id("signup_member");
	 

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		driver.get(Base.BASE_URL);
		ElementActions.waitForElementVisible(driver, memberLogin);
	}

	
	public LoginPage clickMemberLogin() {
		click(driver, memberLogin);
		return new LoginPage(driver);
	}
	
	public boolean isPageLoaded() {
		return ElementActions.isElementVisible(driver, memberLogin);
	}
	
	public void enterEmail(String text) {
		type(driver, email, text);
	}
	
	public void enterZipCode(String text) {
		type(driver, zipCode, text);
	}
	
	public void enterPassword(String text) {
		type(driver, password, text);
	}
	
	public CompleteYourProfilePopUpPage clickSignUp() {
		click(driver, signUpButton);
		return new CompleteYourProfilePopUpPage(driver);
	}
	
	
	

	
	


}
