$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Mathson/eclipse-workspace/automation-practice/src/test/resources/features/account_signup.feature");
formatter.feature({
  "line": 2,
  "name": "Account signUp",
  "description": "",
  "id": "account-signup",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AccountSignUp"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Account SignUp to Register",
  "description": "",
  "id": "account-signup;account-signup-to-register",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Automation practice account  signup page with url \"\u003curl\u003e\",\"\u003cbrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Page successfuly opens",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user inputs signUp information",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "account-signup;account-signup-to-register;",
  "rows": [
    {
      "cells": [
        "url",
        "browser"
      ],
      "line": 10,
      "id": "account-signup;account-signup-to-register;;1"
    },
    {
      "cells": [
        "http://automationpractice.com/",
        "chrome"
      ],
      "line": 11,
      "id": "account-signup;account-signup-to-register;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Account SignUp to Register",
  "description": "",
  "id": "account-signup;account-signup-to-register;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@AccountSignUp"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Automation practice account  signup page with url \"http://automationpractice.com/\",\"chrome\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Page successfuly opens",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user inputs signUp information",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/",
      "offset": 51
    },
    {
      "val": "chrome",
      "offset": 84
    }
  ],
  "location": "AccountSignUpSteps.SignUp(String,String)"
});
formatter.result({
  "duration": 22359325300,
  "status": "passed"
});
formatter.match({
  "location": "AccountSignUpSteps.verifyPageLoad()"
});
formatter.result({
  "duration": 3656999400,
  "status": "passed"
});
formatter.match({
  "location": "AccountSignUpSteps.inputSignUpDetails()"
});
formatter.result({
  "duration": 18057803000,
  "status": "passed"
});
});