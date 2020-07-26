package com.xero.cucumberOptions;


import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/com/xero/featureFile",glue="com/xero/stepDefinition")
public class testNGRunner extends AbstractTestNGCucumberTests{

}
