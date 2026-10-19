package com.stepdefinitionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPojo;
import org.testng.annotations.Test;

import com.Base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {
	LoginPojo l;
	@Given("User has to launch the browser and hit the saucedemo url")
	public void user_has_to_launch_the_browser_and_hit_the_saucedemo_url() {
	  launchURL("https://www.saucedemo.com/");
	  maxWindow();
	}

	/*
	 * @When("User has to enter email in email field") public void
	 * user_has_to_enter_email_in_email_field() { l = new LoginPojo();
	 * fillText(l.getUserName(), "standard_user"); }
	 * 
	 * @When("User has to enter the password in password field") public void
	 * user_has_to_enter_the_password_in_password_field() {
	 * fillText(l.getPassword(), "secret_sauce"); }
	 */
	@When("User has to enter email {string} in email field")
	public void user_has_to_enter_email_in_email_field(String email) {
		l= new LoginPojo();
		fillText(l.getUserName(), email);
	}
	@When("User has to enter the password {string} in password field")
	public void user_has_to_enter_the_password_in_password_field(String password) {
		l= new LoginPojo();
		fillText(l.getPassword(), password);
	}
	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {
	    clickAction(l.getLoginBtn());
	}
	@When("User has enter into home page or not")
	public void user_has_enter_into_home_page_or_not() {
		closePopup();
	    WebElement element = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
	    if(element.isDisplayed()) {
	    	System.out.println("You're reached Home Page!!!");
	    } else {
	    	System.out.println("You're NOT reached Home Page!!!");
	    }
	}
	@Then("User has to close the browsers")
	public void user_has_to_close_the_browser() throws InterruptedException {
		Thread.sleep(3000);
		closeBrowser();
	}



}
