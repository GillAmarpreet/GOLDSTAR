package com.goldstar.test;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.By;

import com.goldstar.main.Base;
import com.goldstar.main.HomePage;
import com.goldstar.main.LoginPage;
import com.goldstar.main.MyProfilePage;
import com.goldstar.main.RegistrationPage;

import utils.RandomUtil;
import utils.WaitUtil;

public class LoginTest extends BaseTest {
	
	@Test(groups = {"smoke"})
	public void loginWithValidCredentials() {
		RegistrationPage regPage = new RegistrationPage(getDriver());
		LoginPage loginPage = regPage.clickMemberLogin();
		loginPage.enterUserName(Base.USER_NAME);
		loginPage.enterPassword(Base.PASSWORD);
		HomePage homePage = loginPage.clickLogin();
		assertTrue(getDriver().findElement(homePage.getMyProfileLocator()).isDisplayed());
		homePage.clickMore();
		WaitUtil.waitHere(2000);
		LoginPage loginPage1 = homePage.clickLogout();
		assertTrue(loginPage1.isPageLoaded());
	}
	
	@Test
	public void loginWithInvalidCredentials() {
		RegistrationPage regPage = new RegistrationPage(getDriver());
		LoginPage loginPage = regPage.clickMemberLogin();
		loginPage.enterUserName(Base.USER_NAME);
		loginPage.enterPassword("abcdef");
		loginPage.clickLogin();
		WaitUtil.waitHere(2000);
		assertTrue("Error should be displayed", getDriver().findElement(By.cssSelector("div[class='flash_notice error shown']")).isDisplayed());
	}
	

	
	


}
