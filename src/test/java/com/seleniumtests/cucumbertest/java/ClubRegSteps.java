package com.seleniumtests.cucumbertest.java;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.seleniumtests.core.CustomVerification;
import com.seleniumtests.dataobject.BBRegistrationDataClub;
import com.seleniumtests.pageobject.ClubSignupPage;
import com.seleniumtests.pageobject.Home;
import com.seleniumtests.pageobject.SignUp;
import com.seleniumtests.pageobject.Welcome;
import com.seleniumtests.utility.HighLight;
import com.seleniumtests.utility.Log;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClubRegSteps {

	RunCukeBase df= new RunCukeBase();
 	BBRegistrationDataClub registrationData;
 	
 	@Given("^I want to open the browser$")
 	public void i_want_to_open_the_browser() throws Throwable {
 	    // Write code here that turns the phrase above into concrete actions
 	    //throw new PendingException();
 		df.createDriver();
 	}

 	@Given("^I visit the https://tbbqabeta\\.productpartners\\.com url$")
 	public void i_visit_the_https_tbbqabeta_productpartners_com_url() throws Throwable {
 	    // Write code here that turns the phrase above into concrete actions
 	    //throw new PendingException();
 	    df.OpenURL("https://tbbqabeta.productpartners.com");
		if(df.driver.getTitle().contains("certificate") || df.driver.getTitle().contains("Certificate"))
		df.driver.navigate().to("javascript:document.getElementById('overridelink').click()") ;
		Log.info("URL accessed");
		Home newHome = PageFactory.initElements(df.driver,
				Home.class);
 	}

 	@Given("^I visit to the Signup Page$")
 	public void i_visit_to_the_Signup_Page() throws Throwable {
 	    // Write code here that turns the phrase above into concrete actions
 	    //throw new PendingException();
		Home newHome = PageFactory.initElements(df.driver,
				Home.class);
		newHome.clickNotAMember();
		SignUp newSignUp = PageFactory.initElements(df.driver,
				SignUp.class);
 	}

 	@When("^I click on the club signup$")
 	public void i_click_on_the_club_signup() throws Throwable {
 	    // Write code here that turns the phrase above into concrete actions
 	    //throw new PendingException();
		SignUp newSignUp = PageFactory.initElements(df.driver,
				SignUp.class);
		newSignUp.clickClubSignup();
		ClubSignupPage registration = PageFactory.initElements(df.driver,
				ClubSignupPage.class);
 	}

 	@Then("^i do submit with valid form entry$")
 	public void i_do_submit_with_valid_form_entry(DataTable users) throws Throwable {
 	    // Write code here that turns the phrase above into concrete actions
 	    // For automatic transformation, change DataTable to one of
 	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
 	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
 	    //throw new PendingException();
		ClubSignupPage registration = PageFactory.initElements(df.driver,
				ClubSignupPage.class);
		List<List<String>> cukedata = users.raw();
		int cukesize = cukedata.size();
		for (int i=1 ;i<cukesize; i++){
		registration.createNewUserCukes(users, i);
		//Log.info("");
		registration.clickSubmit();}
 	}

 	@Then("^i get welcome page$")
 	public void i_get_welcome_page() throws Throwable {
 	    // Write code here that turns the phrase above into concrete actions
 	    //throw new PendingException();
 		Welcome welcome = PageFactory.initElements(df.driver,	Welcome.class);
		
		CustomVerification customVerification = new CustomVerification();
		
		try{
		WebElement errors = df.driver.findElement(By.className("portlet-msg-error"));
		HighLight.highlightElement(errors, df.driver);
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

 	@Then("^i do submit with Invalid form entry$")
 	public void i_do_submit_with_Invalid_form_entry(DataTable users) throws Throwable {
 	    // Write code here that turns the phrase above into concrete actions
 	    // For automatic transformation, change DataTable to one of
 	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
 	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
 	    //throw new PendingException();
		ClubSignupPage registration = PageFactory.initElements(df.driver,
				ClubSignupPage.class);
		List<List<String>> cukedata = users.raw();
		int cukesize = cukedata.size();
		for (int i=1 ;i<cukesize; i++){
		registration.createNewUserCukes(users, i);
		//Log.info("");
		registration.clickInvalid();}
 	}

 	@Then("^i get error page$")
 	public void i_get_error_page() throws Throwable {
 	    // Write code here that turns the phrase above into concrete actions
 	   // throw new PendingException();
 		CustomVerification customVerification = new CustomVerification();
		try{
		WebElement errors = df.driver.findElement(By.className("portlet-msg-error"));
		
		HighLight.highlightElement(errors, df.driver);
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
		Welcome welcome = PageFactory.initElements(df.driver,	Welcome.class);
		customVerification.verifyFalse("New User Created", welcome.WelcomeClub());
		
		customVerification.checkForVerificationErrors();
 	}
}
