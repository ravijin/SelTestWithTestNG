package com.seleniumtests.uiobject;

import java.io.IOException;
import java.util.Properties;

import com.seleniumtests.dataobject.BBRegistrationData;

public class UIClubSignup {
	
	private  String FIRSTNAME;
	private  String LASTNAME;
	private  String EMAIL;
	private  String CONFIRMEMAIL;
	private  String PASSWORD;
	private  String CONFIRMPASSWORD;
	private  String SCREENNAME;
	private  String DATEOFBIRTH;
	private  String PHONETEXTBOX;
	private  String SHIPPINGSTREET1;
	private  String SHIPPINGSTREET2;
	private  String SHIPPINGCITY;
	private  String SHIPPINGSTATE;
	private  String SHIPPINGZIP;
	private  String CCFIRSTNAME;
	private  String CCLASTNAME;
	private  String CCTYPE;
	private  String CCNUMBER;
	private  String CCEXP;
	private  String CCCVV;
	private  String BILLINGCB;
	private  String SHIPPINGCOUNTRY;
	private  String COACHREFERRAL;
	private  String COACHID;
	private  String TNC;
	private  String CASLTNC;
	private  String CAPTCHATEXT;
	private  String SUBMITCLUB;
	//private String ERRORS;
	
	private Properties properties = new Properties();

	public UIClubSignup() throws IOException {
		properties.load(BBRegistrationData.class
				.getResourceAsStream("/UIClub.properties"));
		this.FIRSTNAME = properties.getProperty("firstName");
		this.LASTNAME = properties.getProperty("lastName");
		this.EMAIL = properties.getProperty("email");
		this.CONFIRMEMAIL = properties.getProperty("confirmEmail");
		this.PASSWORD = properties.getProperty("password");
		this.CONFIRMPASSWORD = properties.getProperty("confirmPassword");
		this.SCREENNAME = properties.getProperty("screenName");
		this.DATEOFBIRTH = properties.getProperty("dateOfBirth");
		this.PHONETEXTBOX = properties.getProperty("phoneTextbox");
		this.SHIPPINGSTREET1 = properties.getProperty("shippingStreet1");
		this.SHIPPINGSTREET2 = properties.getProperty("shippingStreet2");
		this.SHIPPINGCITY = properties.getProperty("shippingCity");
		this.SHIPPINGSTATE = properties.getProperty("shippingState");
		this.SHIPPINGZIP = properties.getProperty("shippingZip");
		this.CCFIRSTNAME = properties.getProperty("ccFirstName");
		this.CCLASTNAME = properties.getProperty("ccLastName");
		this.CCTYPE = properties.getProperty("ccType");
		this.CCNUMBER = properties.getProperty("ccNumber");
		this.CCEXP = properties.getProperty("ccExp");
		this.CCCVV = properties.getProperty("ccCvv");
		//BILLINGCB = Boolean.valueOf(properties.getProperty("billingCB"));
		this.BILLINGCB = properties.getProperty("billingCB");
		this.SHIPPINGCOUNTRY = properties.getProperty("shippingCountry");
		//COACHREFERRAL = Boolean.valueOf(properties.getProperty("coachReferral"));
		this.COACHREFERRAL = properties.getProperty("coachReferral");
		this.COACHID = properties.getProperty("coachIdReferral");
		//TNC = Boolean.valueOf(properties.getProperty("tnC"));
		this.TNC = properties.getProperty("tnC");
		//CASLTNC = Boolean.valueOf(properties.getProperty("CASL"));
		this.CASLTNC = properties.getProperty("CASL");
		this.CAPTCHATEXT = properties.getProperty("captchaText");
		this.SUBMITCLUB = properties.getProperty("submitClubSignup");
		//ERRORS = properties.getProperty("errors");
		
	}
	public String getFirstNameUI() {
		return FIRSTNAME;
	}

	public String getLastNameUI() {
		return LASTNAME;
	}

	public String getEmailUI() {
		return EMAIL;
	}

	public String getConfirmEmailUI() {
		return CONFIRMEMAIL;
	}

	public String getPasswordUI() {
		return PASSWORD;
	}

	public String getConfirmPasswordUI() {
		return CONFIRMPASSWORD;
	}

	public String getScreenNameUI() {
		return SCREENNAME;
	}

	public String getDateOfBirthUI() {
		return DATEOFBIRTH;
	}

	public String getPhoneTextboxUI() {
		return PHONETEXTBOX;
	}

	public String getShippingCountryUI() {
		return SHIPPINGCOUNTRY;
	}

	public String getShippingStreet1UI() {
		return SHIPPINGSTREET1;
	}

	public String getShippingStreet2UI() {
		return SHIPPINGSTREET2;
	}

	public String getShippingCityUI() {
		return SHIPPINGCITY;
	}

	public String getShippingStateUI() {
		return SHIPPINGSTATE;
	}

	public String getShippingZipUI() {
		return SHIPPINGZIP;
	}

	public String getCcFirstNameUI() {
		return CCFIRSTNAME;
	}

	public String getCcLastNameUI() {
		return CCLASTNAME;
	}

	public String getCcTypeUI() {
		return CCTYPE;
	}

	public String getCcNumberUI() {
		return CCNUMBER;
	}

	public String getCcExpUI() {
		return CCEXP;
	}

	public String getCcCvvUI() {
		return CCCVV;
	}

	public String getBillingCBUI() {
		return BILLINGCB;
	}

	public String getCoachReferralUI() {
		return COACHREFERRAL;
	}

	public String getCoachIdUI() {
		return COACHID;
	}

	public String getTnCUI() {
		return TNC;
	}

	public String getCASLUI() {
		return CASLTNC;
	}

	
	public String getCaptchaTextUI() {
		return CAPTCHATEXT;
	}

	public String getSubmitUI() {
		return SUBMITCLUB;
	}
	
}
