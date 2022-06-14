@Register
Feature: Checking register feature

  Scenario: Register with valid data
    Given User navigates to Account page
    Then Insert all required data
    And User is able to Register