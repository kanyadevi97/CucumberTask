package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(publish = true, stepNotifications=true, monochrome=true, plugin= {"pretty","json:target\\index.json"},name = {"a", "b"}, features="src\\test\\resources", glue="com.stepdefinition")
public class TestRunnerClass {

@AfterClass
public static void afterClass() {

	Reporting.generateJvmReport("C:\\Users\\ASUS\\eclipse-workspace\\Cucumber\\target\\adactin.json");
}

}

