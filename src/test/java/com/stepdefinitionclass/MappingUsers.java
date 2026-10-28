package com.stepdefinitionclass;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.pojo.LoginPojo;

import com.Base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MappingUsers extends BaseClass {

	LoginPojo l;

	@Given("User has to launch the browser and hit the url")
	public void user_has_to_launch_the_browser_and_hit_the_url() {
		launchURL("https://www.saucedemo.com/");
		maxWindow();
	}

	@When("User has to enter email id")
	public void user_has_to_enter_email_id(io.cucumber.datatable.DataTable dataTable) {
		l = new LoginPojo();
		//List<String> li = dataTable.asList(String.class);
		// To get all cells as a flat list of strings:
		List<List<String>> li = dataTable.asLists(); // Wait, if it's wide use asLists or transpose:
		fillText(l.getUserName(), li.get(0).get(1));
	}

	@When("User has to enter password")
	public void user_has_to_enter_password(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    l = new LoginPojo();
	    //one dimensional map
	    Map<String,String> map = dataTable.asMap(String.class,String.class);
	    fillText(l.getPassword(), map.get("Password 2"));
	    Thread.sleep(5000);
	    clearElementValuesinField(l.getPassword());
	    
	}
	
	@When("User has enter password again using two dimensional format")
	public void user_has_enter_password_again_using_two_dimensional_format(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    l = new LoginPojo();
		//two dimensional map
	    List<Map<String,String>> twoMap = dataTable.asMaps();
	    fillText(l.getPassword(), twoMap.get(0).get("Password 3"));
	    Thread.sleep(6000);
	}
	
	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() throws InterruptedException {
		Thread.sleep(5000);
		closeBrowser();
	}

}
