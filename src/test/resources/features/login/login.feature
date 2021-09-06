Feature: Login
  As a user I would like to login

  Scenario: User logins
    Given user is on login page
    When user logins using following credentials
    | userName                  | password |
    | ztna.automation@gmail.com | Ztna@123 |
    Then user should be logged in