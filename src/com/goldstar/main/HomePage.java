package com.goldstar.main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.ElementActions;
import static utils.DriverActions.click;
import static utils.DriverActions.type;

public class HomePage {
	private WebDriver driver;
	
	private By myProfile = By.cssSelector("div[class='h-nav-item profile'] div[class='h-nav-label']");
	private By more = By.cssSelector("div[class='h-nav-item more'] [class='h-nav-label']");
	private By logOut = By.cssSelector("a[title='Log out']");
	private By imageOne = By.cssSelector("[class='ec flipper ec-featured'] > div > div > img");//#listing-103084 > div >div >img

	public HomePage(WebDriver driver) {
		this.driver = driver;
		ElementActions.waitForElementVisible(driver, myProfile);
	}
	
	public By getMyProfileLocator() {
		return myProfile;
	}
	
	public void clickMore() {
		click(driver, more);
	}
	
	public By getLogoutLocator() {
		return logOut;
	}
	
	public LoginPage clickLogout() {
		click(driver, logOut);
		return new LoginPage(driver);
	}
	
	public boolean isPageLoaded() {
		return ElementActions.isElementVisible(driver, myProfile);
	}
	
	public boolean imagePresent(){
		return driver.findElement(imageOne).isDisplayed();
	}
	
	public MyProfilePage clickMyProfile() {
		click(driver, myProfile);
		return new MyProfilePage(driver);
	}



}
