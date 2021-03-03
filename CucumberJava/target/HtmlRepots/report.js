$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/orderShirt.feature");
formatter.feature({
  "name": "feature to test order T-shirt",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User login the application and order to T-shirt",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user open the url and login application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.OrderSteps.user_open_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select T shirt and confirmed",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.OrderSteps.user_select_tshirt()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "order submited sucessfully",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.OrderSteps.order_submited_sucess()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the order",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.OrderSteps.order_vlidation()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/updateFirstName.feature");
formatter.feature({
  "name": "feature to test update firstname in myaccount",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check My account and update First Name",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user navigate to myaccount page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.OrderSteps.user_navigate_to_myaccount_page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat StepDefinitions.OrderSteps.user_navigate_to_myaccount_page(OrderSteps.java:70)\r\n\tat ✽.user navigate to myaccount page(file:///C:/Data/CucumberJava/src/test/resources/Features/updateFirstName.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Update Firstname",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.OrderSteps.update_Firstname()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "save the details",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.OrderSteps.save_the_details()"
});
formatter.result({
  "status": "skipped"
});
});