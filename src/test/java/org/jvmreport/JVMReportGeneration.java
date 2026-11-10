package org.jvmreport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReportGeneration {

	public static void createJVMReport(String jsonFile) {
	// 1.Mention the target folder location(where we're going to store the jvm report
	File f = new File("C:\\Users\\Arun\\Ziya\\CucumberPractice\\JVMReports");
	
	// 2.Add details to the report using configuration class
	net.masterthought.cucumber.Configuration c = new net.masterthought.cucumber.Configuration(f, "Sauce Demo");
	c.addClassifications("Platform name", "Windows");
	c.addClassifications("Platform version", "11");
	c.addClassifications("Sprint No", "2");
	
	// 3.Add json file paths into List<String>
	List<String> l = new ArrayList<String>();
	l.add(jsonFile);
	
	ReportBuilder r = new ReportBuilder(l, c);
	r.generateReports();
	}
}
