package com.testingpractice.cucumbers.runners;

import java.io.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
//import org.junit.Test;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;





@CucumberOptions(
features= {"src/test/resources/features/"}, 
glue={"com.testingpractice.steps"},
plugin     = {"com.epam.reportportal.cucumber.ScenarioReporter", "io.qameta.allure.cucumber2jvm.AllureCucumber2Jvm","json:target/cucumber-report/report.json"},
monochrome = true
)




public class TestRunner {
	
	//// @AfterClass
	// public  static void writeExtentReport() {
	// Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		 //Reporter.loadXMLConfig(new File("C:/Users/mathsonjoseph/workspace/Appian/config/extent-config.xml"));
	////	 Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	// }

}

