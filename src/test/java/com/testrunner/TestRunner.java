package com.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmreport.JVMReportGeneration;

import io.cucumber.core.api.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "com.stepdefinitionclass",monochrome = true,dryRun = false
, tags="@Feature1 or @Feature2",plugin = {"pretty","json:jsonReports/jsonrepo.json","rerun:src\\test\\resources\\failed.txt"}
)
public class TestRunner {
	
@AfterClass
public static void generate() {
	JVMReportGeneration.createJVMReport("C:\\Users\\Arun\\Ziya\\CucumberPractice\\jsonReports\\jsonrepo.json");
}
	
}
