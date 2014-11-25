Feature: ClubRegistration

Background: SignUp
	Given I want to open the browser
	And I visit the https://tbbqabeta.productpartners.com url
    And I visit to the Signup Page
    When I click on the club signup
	
@run	
Scenario: DataEntryValid
	Then i do submit with valid form entry
	| firstName  | lastName   | email | confirmEmail | password | confirmPassword | screenName | dateOfBirth | phoneTextbox | shippingCountry | shippingStreet1 | shippingStreet2 | shippingCity | shippingState | shippingZip | ccFirstName | ccLastName | ccType | ccNumber | ccExp | ccCvv | billingCB | coachReferral | COACHID | tnC | CASL | captchaText |
  	| OctC | club12 | rj12_011014_c7@mailinator.com | rj12_011014_c7@mailinator.com | 11111 | 11111 | OctC12club7 | 1978 | 1111111111 | Canada | OctC | club7 | montreal | Quebec | h3b5l1 | abc | xyz | Visa | 4222222222222 | 2021 | 123 | TRUE | TRUE | 994 | TRUE | TRUE | 1111 |
 	#| OctC | club8 | rj7_011014_c7@mailinator.com | rj7_011014_c7@mailinator.com | 11111 | 11111 | OctC7club8 | 1978 | 1111111111 | United States | OctC | club7 | seattle | Washington | 98106 | abc | xyz | Visa | 4222222222222 | 2021 | 123 | TRUE | FALSE |  | TRUE | FALSE | 1111 |		
	
	And i get welcome page

@run	
Scenario: DataEntryInValid
	Then i do submit with Invalid form entry
	| firstName  | lastName   | email | confirmEmail | password | confirmPassword | screenName | dateOfBirth | phoneTextbox | shippingCountry | shippingStreet1 | shippingStreet2 | shippingCity | shippingState | shippingZip | ccFirstName | ccLastName | ccType | ccNumber | ccExp | ccCvv | billingCB | coachReferral | COACHID | tnC | CASL | captchaText |
  	| OctC | club8 | rj_011014_c7@mailinator.com | rj_011014_c7@mailinator.com | 11111 | 11111 | OctCclub8 | 1978 | 1111111111 | Canada | OctC | club7 | montreal | Quebec | h3b5l1 | abc | xyz | Visa | 4222222222222 | 2021 | 123 | TRUE | TRUE | 994 | TRUE | TRUE | 1111 |
	#| OctC | club7 | rj_011014_c7@mailinator.com | rj_011014_c7@mailinator.com | 11111 | 11111 | OctCclub7 | 1978 | 1111111111 | Canada | OctC | club7 | montreal | Quebec | h3b5l1 | abc | xyz | Visa | 4222222222222 | 2021 | 123 | TRUE | TRUE | 994 | TRUE | TRUE | 1111 |
	
	And i get error page