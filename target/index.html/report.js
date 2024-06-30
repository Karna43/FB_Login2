$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Launch the url",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user navigates to url \"https://facebook.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "UserLogin.user_navigates_to_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enters username \"karnakhan43@gmail.com\" and password \"Krahn3fcbo@@\"",
  "keyword": "When "
});
formatter.match({
  "location": "UserLogin.user_enters_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "UserLogin.user_clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on try another way",
  "keyword": "And "
});
formatter.match({
  "location": "UserLogin.user_clicks_on_try_another_way()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on notification on another device",
  "keyword": "And "
});
formatter.match({
  "location": "UserLogin.user_clicks_on_notification_on_another_device()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the authentication message \"approve the login to continue\"",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLogin.user_should_see_the_authentication_message(String)"
});
formatter.result({
  "status": "passed"
});
});