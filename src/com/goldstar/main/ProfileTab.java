package com.goldstar.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfileTab {
	
	private WebDriver driver;
	
	private By editProfile = By.linkText("Edit Profile");
	private By emailHistory = By.cssSelector("#secondary_top_nav > a:nth-child(5)");

}
