@AccountSignUp
Feature: Account signUp

  Scenario Outline: Account SignUp to Register
    Given Automation practice account  signup page with url "<url>","<browser>"  
    When Page successfuly opens
    Then user inputs signUp information

    Examples: 
      | url  | browser | 
     | http://automationpractice.com/ | chrome | 
   
