package com.goldstar.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {
	
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	@BeforeTest(alwaysRun=true)
	public void init() {
		System.setProperty("webdriver.chrome.driver", "/Users/Gill/Documents/chromedriver");
		driver =  new ChromeDriver();
		getDriver().manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterTest(alwaysRun=true)
	public void tearDown() {
		driver.quit();
	}

}
