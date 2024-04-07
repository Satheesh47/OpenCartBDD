@Login
Feature: Verifying Login functionality with valid/invalid credentials

  Scenario Outline: User login with invalid credentials
    Given User is on Home Page
    And User navigates to Login Page
    When User enters "<Username>" and "<Password>"
    Then Error message should be displayed
    Examples:
      | Username                | Password    |
      | satheesh.it47@gmail.com | abc123      |
      | test123@mail.com        | Tester@2024 |
      |                         |             |

    Scenario Outline: User login with valid credentials
      Given User is on Home Page
      And User navigates to Login Page
      When User enters "<Username>" and "<Password>"
      Then User should land in My Account Page
      Examples:
        | Username                | Password    |
        | satheesh.it47@gmail.com | Tester@2024 |