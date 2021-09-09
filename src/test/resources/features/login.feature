Feature: Login
  As a user I would like to login

  Scenario Outline: User logins
    Given user is on login page
    When  user adds <email> and <password> to login field
    Then user should see that he is logged in
    Examples:
    | email                     | password |
    | ztna.automation@gmail.com | Ztna@123 |
    | somewon@emumba.com        | wrongpswd |