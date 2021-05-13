$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/validations.feature");
formatter.feature({
  "name": "Validate all the fileds and values on page respectively",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verify the count of values appear on the screen",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on values page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.ValidateFields.user_is_on_values_page()"
});
formatter.result({
  "error_message": "io.cucumber.java.PendingException: TODO: implement me\r\n\tat StepDefinitions.ValidateFields.user_is_on_values_page(ValidateFields.java:11)\r\n\tat ✽.user is on values page(file:///C:/Users/jalla/Desktop/selenium/CucumberJava_MassMutual/src/test/resources/Features/validations.feature:4)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "should validate the fileds in a page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.ValidateFields.should_validate_the_fileds_in_a_page()"
});
formatter.result({
  "status": "skipped"
});
});