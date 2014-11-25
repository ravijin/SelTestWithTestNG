package com.seleniumtests.cucumbertest.java;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestResult;

import com.seleniumtests.utility.Log;


import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Hooks {
	RunCukeBase df= new RunCukeBase();
	ITestResult result;
	
	//this method is to close the browser after each scenario.
	@After()
	public void embedScreenshot(Scenario scenario) throws IOException {
        try {
            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) df.driver)
                        .getScreenshotAs(OutputType.BYTES);
                //File failureImageFile = new File("C:\\D\\MySelWorkspaceBackups\\seleniumtestsbb\\screenshots\\Cucumber"+failureImageFileName);
                scenario.embed(screenshot, "image/png");
            }
        } catch (WebDriverException wde) {
            System.err.println(wde.getMessage());
        } catch (ClassCastException cce) {
          cce.printStackTrace();
        }
        
        df.tearDown();
    }
	
	
}