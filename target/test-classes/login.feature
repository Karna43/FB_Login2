Feature: Login
  
  Background: Launch the url
  	Given user navigates to url "https://facebook.com/"

  Scenario: Login with valid credentials
    When user enters username "karnakhan43@gmail.com" and password "Krahn3fcbo@@"
    And  user clicks on the login button
    And user clicks on try another way
    And user clicks on notification on another device
    Then user should see the authentication message "approve the login to continue"

  Scenario: Login with invalid credentials
    When user enters username "karnakhan43@gmail.com" and password "1111111"
    And user clicks on the login button
    Then user should see an error message "The password that you've entered is incorrect."
    