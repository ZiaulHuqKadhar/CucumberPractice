package com.Base;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	public static void launchURL(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	public void maxWindow() {
		driver.manage().window().maximize();
	}
	
	public void fillText(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public void clickAction(WebElement element) {
		element.click();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void clearElementValuesinField(WebElement element) {
		element.clear();
	}
	
	public void closePopup() {
		/*
		 * Alert a = driver.switchTo().alert();
		 * 
		 * a.accept();
		 */
		// Wait for the OK button on the password manager dialog to be clickable and click it
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
		okButton.click();
		} catch(Exception e) {
			
		}
	}
}
