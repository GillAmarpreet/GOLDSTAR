package com.goldstar.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Facebook extends BaseTest {
	
	@Test
	public void facebookLogin() throws InterruptedException {
		getDriver().get("https://www.facebook.com/");
		getDriver().findElement(By.id("email")).sendKeys("jattsarb@yahoo.com");
		getDriver().findElement(By.id("pass")).sendKeys("Ss844832");
		getDriver().findElement(By.cssSelector("#loginbutton input")).click();
		getDriver().findElement(By.linkText("James")).click();
		getDriver().findElement(By.cssSelector("#fbTimelineHeadline > div:nth-child(2) a:nth-child(3)")).click();
		Thread.sleep(5000);
	}

}
