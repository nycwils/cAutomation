$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into account",
  "description": "Existing user should be able to login to account using correct credentials",
  "id": "login-into-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2910938478,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Log into account with correct credentials",
  "description": "",
  "id": "login-into-account;log-into-account-with-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@important"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User navigates to NYU Contact Us Page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User clicks on student information",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the student information banner should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_navigates_to_nyu_contact_us_page()"
});
formatter.result({
  "duration": 1085732253,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_student_information()"
});
formatter.result({
  "duration": 311044500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.the_student_information_banner_should_be_displayed()"
});
formatter.result({
  "duration": 20259409,
  "status": "passed"
});
formatter.after({
  "duration": 513179515,
  "status": "passed"
});
});