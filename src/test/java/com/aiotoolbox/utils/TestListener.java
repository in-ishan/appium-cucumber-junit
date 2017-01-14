package com.aiotoolbox.utils;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

public class TestListener extends RunListener {
	
	AppiumFactory af=new AppiumFactory();
	Reporting report=new Reporting();
	
	public void testRunStarted(Description desc) {
	af.init();	
	}
	
	public void testRunFinished(Result result) {
		af.quit();
		report.gernateReport();
	}

}
