Feature: User Login

  Scenario: Successful login with valid credentials
    Given the user navigates to the login page
    When the user enters the email "johndoe@example.com"
    And the user enters the password "password123"
    And the user clicks the submit button
    Then the user should be logged in successfully
