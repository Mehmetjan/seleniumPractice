$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Mehme/eclipse-workspace/SeleniumPractice/CucumberFormTest/src/test/resources/feature/form.feature");
formatter.feature({
  "line": 1,
  "name": "IUHRDF contact form test",
  "description": "",
  "id": "iuhrdf-contact-form-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Fill IUHRDF contact form scenario",
  "description": "",
  "id": "iuhrdf-contact-form-test;fill-iuhrdf-contact-form-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "open the main page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "title of the page is IUHRDDF",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user click on Contact textLink",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user enter contact info",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user fill message box",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "cilck on Send Message button",
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
  "location": "StepDefinition.clickOnLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});