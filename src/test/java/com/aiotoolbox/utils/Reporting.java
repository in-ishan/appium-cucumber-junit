package com.aiotoolbox.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class Reporting {
	

	public void gernateReport()
	{
		File reportOutputDirectory = new File("reports/formatted");
		List<String> jsonFiles = new ArrayList<String>();
		String buildNumber = "1";
		String projectName = "All-In-One Toolbox";
		boolean runWithJenkins = true;
		boolean parallelTesting = false;
		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
		//jsonFiles.add("reports/json/result1.json");
		jsonFiles.add("reports/json/result.json");
		// optional configuration
		configuration.setParallelTesting(parallelTesting);
		configuration.setRunWithJenkins(runWithJenkins);
		configuration.setBuildNumber(buildNumber);
		
		// addidtional metadata presented on main page
		configuration.addClassifications("Platform Name", "Android");
		configuration.addClassifications("Platform Version", "6.0.1");
		configuration.addClassifications("Device Name", "Redmi Note 3");
		
		
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		@SuppressWarnings("unused")
		Reportable result = reportBuilder.generateReports();
		
	}
	
	

	
	
	

	

}
