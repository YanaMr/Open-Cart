@Login
Feature: Checking login feature

  Scenario: Login with valid data
    Given User navigates to Login page
    Then Insert valid email and password
    And User is able to Login

  Scenario: Login with invalid email
    Given User navigates to Login page
    Then User inserts invalid email
    And User received Error message

  Scenario: Login with invalid password
    Given User navigates to Login page
    Then User inserts valid Email and invalid Password
    And User received Error message