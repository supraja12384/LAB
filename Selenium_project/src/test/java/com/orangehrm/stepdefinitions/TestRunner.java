package com.orangehrm.stepdefinitions;



	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="C:\\Users\\VICTUS\\OneDrive\\Desktop\\wipro\\selenium_webdriver\\src\\test\\resources\\Features\\login.feature"
	,glue= {"com.orangehrm.stepdefinitions"}
	,dryRun=false
	,monochrome=true)
	public class TestRunner {

	}

