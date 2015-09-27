package com.goldstar.test;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

import com.goldstar.main.Base;
import com.goldstar.main.CompleteYourProfilePopUpPage;
import com.goldstar.main.HomePage;
import com.goldstar.main.RegistrationPage;
import utils.RandomUtil;

public class SignUpTest extends BaseTest {
	
	@Test(groups = {"smoke"})
	public void signUp() {
		String string = RandomUtil.getRandomNumericString(8);
		RegistrationPage regPage = new RegistrationPage(getDriver());
		regPage.enterEmail(string+"@gmail.com");
		regPage.enterZipCode("94568");
		regPage.enterPassword(string);
		CompleteYourProfilePopUpPage c = regPage.clickSignUp();
		c.enterFullName(string);
		
		HomePage homePage = c.clickCreateYourProfileButton();
		assertTrue(homePage.isPageLoaded());

	}
	
}
