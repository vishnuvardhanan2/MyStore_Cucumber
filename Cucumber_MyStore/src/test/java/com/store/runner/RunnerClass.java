package com.store.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/Index.feature",
		glue={"com.mystore.stepdefinitions", "com.mystore.base"},
		
		plugin = {"pretty", "html:target/cucumber-reports.html"} 
		
		)
	

public class RunnerClass {
	
	

}
