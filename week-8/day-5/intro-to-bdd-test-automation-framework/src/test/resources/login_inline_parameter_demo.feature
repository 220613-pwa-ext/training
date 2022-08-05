Feature: login

  Scenario: Valid Login #1
    Given I am at the login page
    When I type in a username of "john_doe"
    And I type in a password of "abc12345"
    And I click the login button
    Then I should be redirected to the success page

  Scenario: Valid Login #2
    Given I am at the login page
    When I type in a username of "jane_doe"
    And I type in a password of "pass123"
    And I click the login button
    Then I should be redirected to the success page

  Scenario: Invalid Login
    Given I am at the login page
    When I type in a username of "sdfgdfgdfgdfg"
    And I type in a password of "asdfsdf123123"
    And I click the login button
    Then I should see a message of "Username and/or password is incorrect"