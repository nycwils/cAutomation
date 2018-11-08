$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into account",
  "description": "Existing user should be able to login to account using correct credentials",
  "id": "login-into-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2502778172,
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
  "duration": 987970872,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_student_information()"
});
formatter.result({
  "duration": 15338133681,
  "error_message": "java.lang.AssertionError: Unable to wait and click on the WebElement, using locator: \u003cProxy element for: DefaultElementLocator \u0027By.linkText: Student Informationn\u0027\u003e\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat PageObjects.BasePage.waitAndClickElement(BasePage.java:47)\n\tat PageObjects.ContactUs_Page.clickStudentInformation(ContactUs_Page.java:31)\n\tat CucumberFramework.Steps.LoginSteps.user_clicks_on_student_information(LoginSteps.java:52)\n\tat ✽.When User clicks on student information(Login.feature:11)\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.the_student_information_banner_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 735234428,
  "status": "passed"
});
});