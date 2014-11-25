package com.seleniumtests.cucumbertest.java;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.Test;

/**
 * An example of using TestNG when the test class does not inherit from 
 * AbstractTestNGCucumberTests.
 */
@CucumberOptions(
				features = {"src/test/resources/com/seleniumtests/cucumbertest/features/ClubRegNew.feature"},
				//glue = {"com.seleniumtests.cucumbertest.java"},
				format = {"pretty", "html:cucumber-html-reports", "json:target/cucumber-report-composite.json"},
				monochrome = true,
				tags = {"@run", "~@wip", "~@notImplemented"}
				)
public class RunCucumberTests {

    /**
     * Create one test method that will be invoked by TestNG and invoke the 
     * Cucumber runner within that method.
     */
    @Test(groups = "examples-testng", description = "Example of using TestNGCucumberRunner to invoke Cucumber")
    public void runCukes() {
        new TestNGCucumberRunner(getClass()).runCukes();
    }
}