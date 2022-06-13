package com.qa.cucumberoptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = {"com/qa/stepdefinitions"}, monochrome=true, publish=true,
		plugin = {"pretty", "json:target/cucumber.json", "junit:target/cucumber.xml"})
public class TestRunner {

}
