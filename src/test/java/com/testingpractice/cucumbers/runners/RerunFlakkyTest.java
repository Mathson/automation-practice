package com.testingpractice.cucumbers.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
/*
@RunWith(Cucumber.class)
@CucumberOptions(
    features   = "@target/generated-test-sources/cucumber/rerun/",
    monochrome = true,
    glue       = "com/nbn/steps",   
    plugin     = {"com.epam.reportportal.cucumber.ScenarioReporter", "io.qameta.allure.cucumber2jvm.AllureCucumber2Jvm","json:target/cucumber-report/report.json"}
)*/
public class RerunFlakkyTest {}
