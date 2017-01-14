package com.aiotoolbox.cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
features="src/test/java/com/aiotoolbox/features",
glue="com/aiotoolbox/glueCode",
dryRun=false,
strict=true,
tags={"@clean, @boost, @batch_uninstall"},
plugin={"pretty","html:reports/html/result.html","json:reports/json/result.json","junit:reports/xml/result.xml"},
monochrome=true
)

public class RunCukeTests {
	
	
}
