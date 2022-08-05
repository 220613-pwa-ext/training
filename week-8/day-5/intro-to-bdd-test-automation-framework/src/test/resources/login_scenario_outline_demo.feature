Feature: login

  Scenario Outline: Valid login
    Given I am at the login page
    When I type in a valid username of <username>
    And I type in a valid password of <password>
    And I click the login button
    Then I should be redirected to the success page

    Examples:
      | username | password |
      | "john_doe" | "abc12345" |
      | "jane_doe" | "pass123"  |
