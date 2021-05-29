$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Mehme/eclipse-workspace/SeleniumPractice/CucumberPractice/src/test/java/feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Gmail Login Feature",
  "description": "",
  "id": "gmail-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Gmail Login Test Scenario",
  "description": "",
  "id": "gmail-login-feature;gmail-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on the google page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "title of the page is Google",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user click on gmail TextLink",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "button is cliked",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.homePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.getTitle()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.GmailPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.logIn()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});