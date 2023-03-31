Feature: Login Feature  //login functionality

  Scenario: Login with valid id & password
    Given  I navigate to login page
    When  i have valid id & password
    Then i can login should see dashboard