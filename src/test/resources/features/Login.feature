@Login
Feature: As a user I should able to login into app

  Background: Navigate to login
    Given Navigate to login page

  @happypath
  Scenario: I login with valid credential
    And Enter "tomsmith" as username
    And Enter "SuperSecretPassword!" as password
    When Click on login to submit
    Then Verify "You logged into a secure area!" success message is displayed
    When Click on logout
    Then Verify "You logged out of the secure area!" log out message is displayed

  @negative_login_cases
  Scenario Outline: I login with invalid credential
    And Enter <username> as username
    And Enter <password> as password
    When Click on login to submit
    Then Verify <messages> fail message is displayed
    Examples:
      | title                         | username   | password               | messages                         |
      | invalid password              | "tomsmith" | "SuperSecretPassword"  | "Your password is invalid!"      |
      | invalid username              | "omsmith"  | "SuperSecretPassword!" | "Your username is invalid!"      |
      | invalid username              | "omsmith"  | "SuperSecretPassword!" | "Your username is invalid!"      |
      | invalid username and password | "omsmith"  | "SuperSecretPassword"  | "Your username is invalid!"      |
      | long username                 | "omsmith"  | "SuperSecretPassword"  | "Your username is invalid!"      |