Feature: User Registration

  Scenario: Successful registration with valid details
    Given the user navigates to the registration page
    When the user selects the gender "male"
    And the user enters the first name "John"
    And the user enters the last name "Doe"
    And the user selects date of birth "15-6-1990"
    And the user enters the email "johndoe@example.com"
    And the user enters the password "password123"
    And the user confirms the password "password123"
    And the user clicks the register button
    Then the registration should be successful
