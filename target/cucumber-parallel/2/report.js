$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Mathson/eclipse-workspace/automation-practice/src/test/resources/features/email_verification.feature");
formatter.feature({
  "line": 2,
  "name": "Email Verification",
  "description": "",
  "id": "email-verification",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@EmailVerify"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Email verify to Register",
  "description": "",
  "id": "email-verification;email-verify-to-register",
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
  "name": "user inputs invalid email information",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "email-verification;email-verify-to-register;",
  "rows": [
    {
      "cells": [
        "url",
        "browser"
      ],
      "line": 10,
      "id": "email-verification;email-verify-to-register;;1"
    },
    {
      "cells": [
        "http://automationpractice.com/",
        "chrome"
      ],
      "line": 11,
      "id": "email-verification;email-verify-to-register;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Email verify to Register",
  "description": "",
  "id": "email-verification;email-verify-to-register;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@EmailVerify"
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
  "name": "user inputs invalid email information",
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
  "duration": 21226506400,
  "status": "passed"
});
formatter.match({
  "location": "AccountSignUpSteps.verifyPageLoad()"
});
formatter.result({
  "duration": 3868345700,
  "status": "passed"
});
formatter.match({
  "location": "AccountSignUpSteps.inputInvalidEmailDetails()"
});
formatter.result({
  "duration": 8114585000,
  "status": "passed"
});
});