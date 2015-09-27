package com.goldstar.test;

import static org.testng.AssertJUnit.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.goldstar.main.Base;
import com.goldstar.main.EditProfilePage;
import com.goldstar.main.EmailHistoryPage;
import com.goldstar.main.HomePage;
import com.goldstar.main.LoginPage;
import com.goldstar.main.MyProfilePage;
import com.goldstar.main.RegistrationPage;

import utils.WaitUtil;

public class MyProfileTabTests extends BaseTest {
	
	@Test
	public void editProfileTest() {
		RegistrationPage regPage = new RegistrationPage(getDriver());
		LoginPage loginPage = regPage.clickMemberLogin();
		loginPage.enterUserName(Base.USER_NAME);
		loginPage.enterPassword(Base.PASSWORD);
		HomePage homePage = loginPage.clickLogin();
		MyProfilePage myProfilePage = homePage.clickMyProfile();
		EditProfilePage editProfilePage = myProfilePage.clickEditProfile();
		editProfilePage.enterWebsite("facebook.com");
		

	}
	
	@Test
	public void emailHistoryTest() {
		RegistrationPage regPage = new RegistrationPage(getDriver());
		LoginPage loginPage = regPage.clickMemberLogin();
		loginPage.enterUserName(Base.USER_NAME);
		loginPage.enterPassword(Base.PASSWORD);
		HomePage homePage = loginPage.clickLogin();
		MyProfilePage myProfilePage = homePage.clickMyProfile();
		EmailHistoryPage emailHistoryPage = myProfilePage.clickEmailHistory();
		int a = emailHistoryPage.getEmailsCount();
		Reporter.log("Number of emails : "+a, true);
		assertTrue(a > 12);
	}

}
