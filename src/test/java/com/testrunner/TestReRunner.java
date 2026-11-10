package com.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmreport.JVMReportGeneration;

import io.cucumber.core.api.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@C:\\Users\\Arun\\Ziya\\CucumberPractice\\src\\test\\resources\\failed.txt", glue = "com.stepdefinitionclass",
plugin = {"pretty","json:jsonReports/jsonrepo.json"}
)
public class TestReRunner {
	
}
	
