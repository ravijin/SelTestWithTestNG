$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/seleniumtests/cucumbertest/features/ClubRegNew.feature");
formatter.feature({
  "id": "clubregistration",
  "description": "",
  "name": "ClubRegistration",
  "keyword": "Feature",
  "line": 1
});
formatter.background({
  "description": "",
  "name": "SignUp",
  "keyword": "Background",
  "line": 3,
  "type": "background"
});
formatter.step({
  "name": "I want to open the browser",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "I visit the https://tbbqabeta.productpartners.com url",
  "keyword": "And ",
  "line": 5
});
formatter.step({
  "name": "I visit to the Signup Page",
  "keyword": "And ",
  "line": 6
});
formatter.step({
  "name": "I click on the club signup",
  "keyword": "When ",
  "line": 7
});
formatter.match({
  "location": "ClubRegSteps.i_want_to_open_the_browser()"
});
formatter.result({
  "duration": 12848223332,
  "status": "passed"
});
formatter.match({
  "location": "ClubRegSteps.i_visit_the_https_tbbqabeta_productpartners_com_url()"
});
formatter.result({
  "duration": 125368240509,
  "status": "passed"
});
formatter.match({
  "location": "ClubRegSteps.i_visit_to_the_Signup_Page()"
});
formatter.result({
  "duration": 481541175,
  "status": "passed"
});
formatter.match({
  "location": "ClubRegSteps.i_click_on_the_club_signup()"
});
formatter.result({
  "duration": 24454785649,
  "status": "passed"
});
formatter.scenario({
  "id": "clubregistration;dataentryvalid",
  "tags": [
    {
      "name": "@run",
      "line": 9
    }
  ],
  "description": "",
  "name": "DataEntryValid",
  "keyword": "Scenario",
  "line": 10,
  "type": "scenario"
});
formatter.step({
  "name": "i do submit with valid form entry",
  "keyword": "Then ",
  "line": 11,
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "email",
        "confirmEmail",
        "password",
        "confirmPassword",
        "screenName",
        "dateOfBirth",
        "phoneTextbox",
        "shippingCountry",
        "shippingStreet1",
        "shippingStreet2",
        "shippingCity",
        "shippingState",
        "shippingZip",
        "ccFirstName",
        "ccLastName",
        "ccType",
        "ccNumber",
        "ccExp",
        "ccCvv",
        "billingCB",
        "coachReferral",
        "COACHID",
        "tnC",
        "CASL",
        "captchaText"
      ],
      "line": 12
    },
    {
      "cells": [
        "OctC",
        "club11",
        "rj11_011014_c7@mailinator.com",
        "rj11_011014_c7@mailinator.com",
        "11111",
        "11111",
        "OctC11club7",
        "1978",
        "1111111111",
        "Canada",
        "OctC",
        "club7",
        "montreal",
        "Quebec",
        "h3b5l1",
        "abc",
        "xyz",
        "Visa",
        "4222222222222",
        "2021",
        "123",
        "TRUE",
        "TRUE",
        "994",
        "TRUE",
        "TRUE",
        "1111"
      ],
      "line": 13
    }
  ]
});
formatter.step({
  "name": "i get welcome page",
  "keyword": "And ",
  "line": 16,
  "comments": [
    {
      "value": "#| OctC | club8 | rj7_011014_c7@mailinator.com | rj7_011014_c7@mailinator.com | 11111 | 11111 | OctC7club8 | 1978 | 1111111111 | United States | OctC | club7 | seattle | Washington | 98106 | abc | xyz | Visa | 4222222222222 | 2021 | 123 | TRUE | FALSE |  | TRUE | FALSE | 1111 |",
      "line": 14
    }
  ]
});
formatter.match({
  "location": "ClubRegSteps.i_do_submit_with_valid_form_entry(DataTable)"
});
formatter.result({
  "duration": 27929419748,
  "status": "failed",
  "error_message": "org.openqa.selenium.TimeoutException: Timed out after 15 seconds waiting for visibility of [[FirefoxDriver: firefox on WINDOWS (8e3d6f1f-dffa-4ea3-b226-6c8e951ea5fb)] -\u003e css selector: span[id*\u003d\u0027_TBBSIGNUP_WAR_signuprefactorportlet_coach\u0027]]\nBuild info: version: \u00272.43.0\u0027, revision: \u0027accb3003b9fb8f7cae30f9669b4c594a065396a6\u0027, time: \u00272014-09-09 22:22:51\u0027\nSystem info: host: \u0027RJINDAL\u0027, ip: \u0027192.168.207.161\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_67\u0027\nSession ID: 8e3d6f1f-dffa-4ea3-b226-6c8e951ea5fb\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{platform\u003dWINDOWS, databaseEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, javascriptEnabled\u003dtrue, acceptSslCerts\u003dtrue, handlesAlerts\u003dtrue, browserName\u003dfirefox, webStorageEnabled\u003dtrue, nativeEvents\u003dtrue, rotatable\u003dfalse, locationContextEnabled\u003dtrue, applicationCacheEnabled\u003dtrue, takesScreenshot\u003dtrue, version\u003d32.0.3}]\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:79)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)\r\n\tat com.seleniumtests.pageobject.ClubSignupPage.enterCoachReferral(ClubSignupPage.java:375)\r\n\tat com.seleniumtests.pageobject.ClubSignupPage.createNewUserCukes(ClubSignupPage.java:659)\r\n\tat com.seleniumtests.cucumbertest.java.ClubRegSteps.i_do_submit_with_valid_form_entry(ClubRegSteps.java:82)\r\n\tat ✽.Then i do submit with valid form entry(src/test/resources/com/seleniumtests/cucumbertest/features/ClubRegNew.feature:11)\r\n"
});
formatter.match({
  "location": "ClubRegSteps.i_get_welcome_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2566146998,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "SignUp",
  "keyword": "Background",
  "line": 3,
  "type": "background"
});
formatter.step({
  "name": "I want to open the browser",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "I visit the https://tbbqabeta.productpartners.com url",
  "keyword": "And ",
  "line": 5
});
formatter.step({
  "name": "I visit to the Signup Page",
  "keyword": "And ",
  "line": 6
});
formatter.step({
  "name": "I click on the club signup",
  "keyword": "When ",
  "line": 7
});
formatter.match({
  "location": "ClubRegSteps.i_want_to_open_the_browser()"
});
formatter.result({
  "duration": 8310237086,
  "status": "passed"
});
formatter.match({
  "location": "ClubRegSteps.i_visit_the_https_tbbqabeta_productpartners_com_url()"
});
formatter.result({
  "duration": 145099588326,
  "status": "passed"
});
formatter.match({
  "location": "ClubRegSteps.i_visit_to_the_Signup_Page()"
});
formatter.result({
  "duration": 488107925,
  "status": "passed"
});
formatter.match({
  "location": "ClubRegSteps.i_click_on_the_club_signup()"
});
formatter.result({
  "duration": 30792375575,
  "status": "passed"
});
formatter.scenario({
  "id": "clubregistration;dataentryinvalid",
  "tags": [
    {
      "name": "@run",
      "line": 18
    }
  ],
  "description": "",
  "name": "DataEntryInValid",
  "keyword": "Scenario",
  "line": 19,
  "type": "scenario"
});
formatter.step({
  "name": "i do submit with Invalid form entry",
  "keyword": "Then ",
  "line": 20,
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "email",
        "confirmEmail",
        "password",
        "confirmPassword",
        "screenName",
        "dateOfBirth",
        "phoneTextbox",
        "shippingCountry",
        "shippingStreet1",
        "shippingStreet2",
        "shippingCity",
        "shippingState",
        "shippingZip",
        "ccFirstName",
        "ccLastName",
        "ccType",
        "ccNumber",
        "ccExp",
        "ccCvv",
        "billingCB",
        "coachReferral",
        "COACHID",
        "tnC",
        "CASL",
        "captchaText"
      ],
      "line": 21
    },
    {
      "cells": [
        "OctC",
        "club8",
        "rj_011014_c7@mailinator.com",
        "rj_011014_c7@mailinator.com",
        "11111",
        "11111",
        "OctCclub8",
        "1978",
        "1111111111",
        "Canada",
        "OctC",
        "club7",
        "montreal",
        "Quebec",
        "h3b5l1",
        "abc",
        "xyz",
        "Visa",
        "4222222222222",
        "2021",
        "123",
        "TRUE",
        "TRUE",
        "994",
        "TRUE",
        "TRUE",
        "1111"
      ],
      "line": 22
    }
  ]
});
formatter.step({
  "name": "i get error page",
  "keyword": "And ",
  "line": 25,
  "comments": [
    {
      "value": "#| OctC | club7 | rj_011014_c7@mailinator.com | rj_011014_c7@mailinator.com | 11111 | 11111 | OctCclub7 | 1978 | 1111111111 | Canada | OctC | club7 | montreal | Quebec | h3b5l1 | abc | xyz | Visa | 4222222222222 | 2021 | 123 | TRUE | TRUE | 994 | TRUE | TRUE | 1111 |",
      "line": 23
    }
  ]
});
formatter.match({
  "location": "ClubRegSteps.i_do_submit_with_Invalid_form_entry(DataTable)"
});
formatter.result({
  "duration": 25093191122,
  "status": "failed",
  "error_message": "org.openqa.selenium.TimeoutException: Timed out after 15 seconds waiting for visibility of [[FirefoxDriver: firefox on WINDOWS (9527d2cd-03a2-44c4-893b-4472eb70cd14)] -\u003e css selector: span[id*\u003d\u0027_TBBSIGNUP_WAR_signuprefactorportlet_coach\u0027]]\nBuild info: version: \u00272.43.0\u0027, revision: \u0027accb3003b9fb8f7cae30f9669b4c594a065396a6\u0027, time: \u00272014-09-09 22:22:51\u0027\nSystem info: host: \u0027RJINDAL\u0027, ip: \u0027192.168.207.161\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_67\u0027\nSession ID: 9527d2cd-03a2-44c4-893b-4472eb70cd14\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{platform\u003dWINDOWS, databaseEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, javascriptEnabled\u003dtrue, acceptSslCerts\u003dtrue, handlesAlerts\u003dtrue, browserName\u003dfirefox, webStorageEnabled\u003dtrue, nativeEvents\u003dtrue, rotatable\u003dfalse, locationContextEnabled\u003dtrue, applicationCacheEnabled\u003dtrue, takesScreenshot\u003dtrue, version\u003d32.0.3}]\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:79)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)\r\n\tat com.seleniumtests.pageobject.ClubSignupPage.enterCoachReferral(ClubSignupPage.java:375)\r\n\tat com.seleniumtests.pageobject.ClubSignupPage.createNewUserCukes(ClubSignupPage.java:659)\r\n\tat com.seleniumtests.cucumbertest.java.ClubRegSteps.i_do_submit_with_Invalid_form_entry(ClubRegSteps.java:126)\r\n\tat ✽.Then i do submit with Invalid form entry(src/test/resources/com/seleniumtests/cucumbertest/features/ClubRegNew.feature:20)\r\n"
});
formatter.match({
  "location": "ClubRegSteps.i_get_error_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 2796541987,
  "status": "passed"
});
});