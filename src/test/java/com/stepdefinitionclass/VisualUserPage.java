package com.stepdefinitionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPojo;

import com.Base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisualUserPage extends BaseClass {

	LoginPojo l;
	@Given("user has to launch the browser and hit the saucedemo url")
	public void user_has_to_launch_the_browser_and_hit_the_saucedemo_url() {
		 launchURL("https://www.saucedemo.com/");
		  maxWindow();
	}
	@When("visual_user has to enter email in email field")
	public void visual_user_has_to_enter_email_in_email_field() {
		l = new LoginPojo();
	    fillText(l.getUserName(), "visual_user");
	}
	@When("visual_user has to enter the password in password field")
	public void visual_user_has_to_enter_the_password_in_password_field() {
		l = new LoginPojo();
	    fillText(l.getPassword(), "secret_sauce");
	}
	@When("visual_user has to click the login button")
	public void visual_user_has_to_click_the_login_button() {
		l = new LoginPojo();
	 clickAction(l.getLoginBtn());   
	}
	@When("visual_user has enter into home page or not")
	public void visual_user_has_enter_into_home_page_or_not() {
		closePopup();
	    WebElement element = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
	    if(element.isDisplayed()) {
	    	System.out.println("You're reached Home Page!!!");
	    } else {
	    	System.out.println("You're NOT reached Home Page!!!");
	    }
	}
	@Then("visual_user has to close the browsers")
	public void visual_user_has_to_close_the_browsers() {
	    closeBrowser();
	}



}
