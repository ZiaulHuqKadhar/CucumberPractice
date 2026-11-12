package com.stepdefinitionclass;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.TakesScreenshot;

import com.Base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass{

	@Before(order=1)
	public void beforeExe1() {
		launchURL("https://www.saucedemo.com/");
	}
	
	@Before(order=2)
	public void beforeExe2() {
		maxWindow();
	}
	
	@After
	/*public void afterExe1() {
		closeBrowser();
	}*/
	public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failed Screenshot");
        }
        if (driver != null) {
            driver.quit();
        }
    }
	
}
