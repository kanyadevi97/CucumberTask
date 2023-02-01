package com.report;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void generateJvmReport(String jsonFile) {

//1. Mention the path of jvm report ---> where to store
		File file = new File("C:\\Users\\ASUS\\eclipse-workspace\\Cucumber\\target");
		
//2. create the object for configuration class
		Configuration configuration = new Configuration(file, "Adactin Automation");

//3. k,v -->browser, version, sprint, os
		configuration.addClassifications("Browser", "Chrome");
        configuration.addClassifications("Version", "108");
        configuration.addClassifications("OS", "WIN10");
        configuration.addClassifications("sprint", "34");
        
//4. create object for report builder class
        List<String> jsonFiles =new ArrayList<String>();
        jsonFiles.add(jsonFile);
        ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
        
//5. Generate jvm report
        builder.generateReports();
        
		
	
	
	}
}
