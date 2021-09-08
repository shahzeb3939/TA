Feature: Login
  As a user I would like to login

  Scenario Outline: User logins
    Given user is on login page
    When user adds <userName> and <password> to login
    Then user should see that he is logged in

    Examples:
    | userName                  | password |
    | ztna.automation@gmail.com | Ztna@123 |
    | hehe@gmail.com            | password |
