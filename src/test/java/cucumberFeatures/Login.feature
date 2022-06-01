Feature: Checking login feature

  Scenario: Login with valid data
    Given User navigates to Login page
    Then Insert valid email and password
    And User is able to Login