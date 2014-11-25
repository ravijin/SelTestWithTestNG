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
  "duration": 6230516510,
  "status": "passed"
});
formatter.match({
  "location": "ClubRegSteps.i_visit_the_https_tbbqabeta_productpartners_com_url()"
});
formatter.result({
  "duration": 12322029174,
  "status": "passed"
});
formatter.match({
  "location": "ClubRegSteps.i_visit_to_the_Signup_Page()"
});
formatter.result({
  "duration": 11985575631,
  "status": "passed"
});
formatter.match({
  "location": "ClubRegSteps.i_click_on_the_club_signup()"
});
formatter.result({
  "duration": 9155309208,
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
        "club12",
        "rj12_011014_c7@mailinator.com",
        "rj12_011014_c7@mailinator.com",
        "11111",
        "11111",
        "OctC12club7",
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
  "duration": 10870949984,
  "status": "passed"
});
formatter.match({
  "location": "ClubRegSteps.i_get_welcome_page()"
});
formatter.result({
  "duration": 168932247,
  "status": "failed",
  "error_message": "java.lang.AssertionError: java.lang.AssertionError: expected [false] but found [true]java.lang.AssertionError: expected [true] but found [false]\r\n\tat com.thoughtworks.selenium.SeleneseTestBase.fail(SeleneseTestBase.java:391)\r\n\tat com.seleniumtests.core.CustomVerification.checkForVerificationErrors(CustomVerification.java:102)\r\n\tat com.seleniumtests.cucumbertest.java.ClubRegSteps.i_get_welcome_page(ClubRegSteps.java:113)\r\n\tat ✽.And i get welcome page(src/test/resources/com/seleniumtests/cucumbertest/features/ClubRegNew.feature:16)\r\n"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 5110042624,
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
  "duration": 2453611676,
  "status": "passed"
});
formatter.match({
  "location": "ClubRegSteps.i_visit_the_https_tbbqabeta_productpartners_com_url()"
});
formatter.result({
  "duration": 15295790098,
  "status": "passed"
});
formatter.match({
  "location": "ClubRegSteps.i_visit_to_the_Signup_Page()"
});
formatter.result({
  "duration": 3133300519,
  "status": "passed"
});
formatter.match({
  "location": "ClubRegSteps.i_click_on_the_club_signup()"
});
formatter.result({
  "duration": 23548525891,
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
  "duration": 13272252639,
  "status": "passed"
});
formatter.match({
  "location": "ClubRegSteps.i_get_error_page()"
});
formatter.result({
  "duration": 153452435,
  "status": "passed"
});
formatter.after({
  "duration": 3405246912,
  "status": "passed"
});
});