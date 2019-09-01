@EmailVerify
Feature: Email Verification

  Scenario Outline: Email verify to Register
    Given Automation practice account  signup page with url "<url>","<browser>"  
    When Page successfuly opens
    Then user inputs invalid email information

    Examples: 
      | url  | browser | 
     | http://automationpractice.com/ | chrome | 
   
