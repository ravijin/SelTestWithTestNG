package com.seleniumtests.test;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.seleniumtests.core.CustomVerification;
import com.seleniumtests.core.DriverFactory;
import com.seleniumtests.dataobject.BBRegistrationData;
import com.seleniumtests.dataobject.BBRegistrationDataClub;
import com.seleniumtests.pageobject.ClubSignupPage;
import com.seleniumtests.pageobject.FreeSignupPage;
import com.seleniumtests.pageobject.Home;
import com.seleniumtests.pageobject.SignUp;
import com.seleniumtests.pageobject.Welcome;
import com.seleniumtests.utility.HighLight;
import com.seleniumtests.utility.Log;

public class ClubReg extends DriverFactory {
	
	@Test(dataProvider = "regCSVDataBB_club", dataProviderClass = BBRegistrationDataClub.class, enabled=false)
	public void newClubRegistrationUsingCSVFile(BBRegistrationDataClub registrationData) {
		Log.startTestCase("newClubRegistrationUsingCSVFile");
		driver.get(appURL);
		if(driver.getTitle().contains("certificate") || driver.getTitle().contains("Certificate"))
		driver.navigate().to("javascript:document.getElementById('overridelink').click()") ;

		Log.info("URL accessed");
		Home newHome = PageFactory.initElements(driver,
				Home.class);
		newHome.clickNotAMember();
		SignUp newSignUp = PageFactory.initElements(driver,
				SignUp.class);
		newSignUp.clickClubSignup();
		ClubSignupPage registration = PageFactory.initElements(driver,
				ClubSignupPage.class);
		registration.createNewUser(registrationData);
		//Log.info("");
		registration.clickSubmit();
		Welcome welcome = PageFactory.initElements(driver,	Welcome.class);
		
		CustomVerification customVerification = new CustomVerification();
		
		try{
		WebElement errors = driver.findElement(By.className("portlet-msg-error"));
		HighLight.highlightElement(errors, driver);
		String err = errors.getText();
		
		if (err.contains("Please enter a valid") || err.contains("Please select a valid"))
		customVerification.verifyFalse("Invalid Entry",true);
		
		if (err.contains("Please enter your") || err.contains("Please confirm your") || err.contains("Please enter the cardholder's") || err.contains("Please enter a Screen Name") || err.contains("Please agree to the terms"))
		customVerification.verifyFalse("Blank Entry", true);
		
		customVerification.verifyFalse("Existing User", err.contains("You already have an account"));
		customVerification.verifyFalse("Invalid Captcha", err.contains("Text Verification failed"));
		}catch(Exception e){e.printStackTrace();};
		customVerification.verifyTrue("Not Created Successfully", welcome.WelcomeClub());
		
		customVerification.checkForVerificationErrors();
	}
	
	//@Test(dataProvider = "regCSVDataBBDuplicate_club", dataProviderClass = BBRegistrationDataClub.class, enabled=true, dependsOnMethods={"newClubRegistrationUsingCSVFile"},alwaysRun=true)
	@Test(dataProvider = "regCSVDataBBDuplicate_club", dataProviderClass = BBRegistrationDataClub.class, enabled=true)
	public void DuplicateClubRegistrationUsingCSVFile(BBRegistrationDataClub registrationData) {
		Log.startTestCase("Test Case:: DuplicateClubRegistrationUsingCSVFile");
		driver.get(appURL);
		//if (driver.GetType() == typeof(InternetExplorerDriver) && driver.Title.Contains("Certificate"))
		if(driver.getTitle().contains("certificate") || driver.getTitle().contains("Certificate"))
		driver.navigate().to("javascript:document.getElementById('overridelink').click()") ;

		Home newHome = PageFactory.initElements(driver,
				Home.class);
		newHome.clickNotAMember();
		SignUp newSignUp = PageFactory.initElements(driver,
				SignUp.class);
		newSignUp.clickClubSignup();
		ClubSignupPage registration = PageFactory.initElements(driver,
				ClubSignupPage.class);
		registration.createNewUser(registrationData);

		registration.clickInvalid();
		
		CustomVerification customVerification = new CustomVerification();
		try{
		WebElement errors = driver.findElement(By.className("portlet-msg-error"));
		
		HighLight.highlightElement(errors, driver);
		String err = errors.getText();				
				
		customVerification.verifyTrue("Not Duplicate User", err.contains("You already have an account"));
		
		if (err.contains("Please enter a valid") || err.contains("Please select a valid"))
		customVerification.verifyFalse("Invalid Entry for New User",true);
		
		if (err.contains("Please enter your") || err.contains("Please confirm your") || err.contains("Please enter the cardholder's") || err.contains("Please enter a Screen Name") || err.contains("Please agree to the terms"))
		customVerification.verifyFalse("Blank Entry for New user", true);
		
		customVerification.verifyFalse("Invalid Captcha", err.contains("Text Verification failed"));
		}catch(Exception e){
			e.printStackTrace();
			};		
		//customVerification.verifyTrue("New User Not Created Successfully", welcome.WelcomeClub());
		Welcome welcome = PageFactory.initElements(driver,	Welcome.class);
		customVerification.verifyFalse("New User Created", welcome.WelcomeClub());
		
		customVerification.checkForVerificationErrors();
	}
	


	@Test(dataProvider = "regRANDOMDataBB_club", dataProviderClass = BBRegistrationDataClub.class, enabled=true)
	public void newClubRegistrationUsingDP2(BBRegistrationDataClub registrationData) {
		driver.get(appURL);
		if(driver.getTitle().contains("certificate") || driver.getTitle().contains("Certificate"))
		driver.navigate().to("javascript:document.getElementById('overridelink').click()") ;
		Home newHome = PageFactory.initElements(driver,
				Home.class);
		newHome.clickNotAMember();
		SignUp newSignUp = PageFactory.initElements(driver,
				SignUp.class);
		newSignUp.clickClubSignup();
		ClubSignupPage registration = PageFactory.initElements(driver,
				ClubSignupPage.class);
		registration.createNewUser(registrationData);
		registration.clickSubmit();
		Welcome welcome = PageFactory.initElements(driver,	Welcome.class);
		
		CustomVerification customVerification = new CustomVerification();
		
		try{
		WebElement errors = driver.findElement(By.className("portlet-msg-error"));
		HighLight.highlightElement(errors, driver);
		String err = errors.getText();
		
		if (err.contains("Please enter a valid") || err.contains("Please select a valid"))
		customVerification.verifyFalse("Invalid Entry",true);
		
		if (err.contains("Please enter your") || err.contains("Please confirm your") || err.contains("Please enter the cardholder's") || err.contains("Please enter a Screen Name") || err.contains("Please agree to the terms"))
		customVerification.verifyFalse("Blank Entry", true);
		
		customVerification.verifyFalse("Existing User", err.contains("You already have an account"));
		customVerification.verifyFalse("Invalid Captcha", err.contains("Text Verification failed"));
		}catch(Exception e){e.printStackTrace();};
		customVerification.verifyTrue("Not Created Successfully", welcome.WelcomeClub());
		
		customVerification.checkForVerificationErrors();
	}

}
