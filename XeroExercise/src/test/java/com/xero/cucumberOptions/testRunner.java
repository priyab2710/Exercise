package com.xero.cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/xero/featureFile",plugin={"pretty","html:target/cucumber-html-report",
		"json:target/cucumber.json"},glue="com/xero/stepDefinition")
public class testRunner{

}
