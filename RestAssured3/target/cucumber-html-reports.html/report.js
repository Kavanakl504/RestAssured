$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:resources/features/ApiDemo.feature");
formatter.feature({
  "name": "Verify all GET and POST requests",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user sets the endpoint to \"base\"",
  "keyword": "Given "
});
formatter.match({
  "location": "crud.APIStepDev.sets_the(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get employee record",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user makes a get call to \"endpoint\"",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "crud.APIStepDev.makes_a_get_call_to_with_below_attributes(java.lang.String,java.util.List\u003cjava.util.Map\u003cjava.lang.String, java.lang.String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I receive valid HTTP Response 200",
  "keyword": "Then "
});
formatter.match({
  "location": "crud.APIStepDev.i_receive_valid_HTTP_Response_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user sets the endpoint to \"base\"",
  "keyword": "Given "
});
formatter.match({
  "location": "crud.APIStepDev.sets_the(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create record",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user makes a POST call to \"endpoint\"",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "crud.APIStepDev.user_makes_a_POST_call_to(java.lang.String,java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I receive valid HTTP Response 201",
  "keyword": "Then "
});
formatter.match({
  "location": "crud.APIStepDev.i_receive_valid_HTTP_Response_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user sets the endpoint to \"base\"",
  "keyword": "Given "
});
formatter.match({
  "location": "crud.APIStepDev.sets_the(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "update the created user",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user makes a PUT request to \"endpoint2\" with following data",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "crud.APIStepDev.user_makes_a_PUT_request_to_with_following_data(java.lang.String,java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I receive valid HTTP Response 200",
  "keyword": "Then "
});
formatter.match({
  "location": "crud.APIStepDev.i_receive_valid_HTTP_Response_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user sets the endpoint to \"base\"",
  "keyword": "Given "
});
formatter.match({
  "location": "crud.APIStepDev.sets_the(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete all the data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user makes a DELETE request to \"endpoint2\"",
  "keyword": "When "
});
formatter.match({
  "location": "crud.APIStepDev.user_makes_a_DELETE_request_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates for the content-length",
  "rows": [
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "crud.APIStepDev.user_validates_for_the_content_length(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I receive valid HTTP Response 204",
  "keyword": "Then "
});
formatter.match({
  "location": "crud.APIStepDev.i_receive_valid_HTTP_Response_code(int)"
});
formatter.result({
  "status": "passed"
});
});