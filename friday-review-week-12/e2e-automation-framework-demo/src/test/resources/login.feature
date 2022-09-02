Feature: Login

  Scenario: Valid Login
    Given I am at the login page
    When I type in a username of "testing123"
    And I type in a password of "password123"
    And I click the login button
    Then I should be redirected to the user page

  Scenario: Valid username, invalid password
    Given I am at the login page
    When I type in a username of "testing123"
    And I type in a password of "obviouslyincorrectpassword"
    And I click the login button
    Then I should have an alert pop up

  Scenario: Invalid username, valid password
    Given I am at the login page
    When I type in a username of "obviouslyincorrectusername"
    And I type in a password of "password123"
    And I click the login button
    Then I should have an alert pop up

  Scenario: Invalid username, invalid password
    Given I am at the login page
    When I type in a username of "obviouslyincorrectusername"
    And I type in a password of "obviouslyincorrectpassword"
    And I click the login button
    Then I should have an alert pop up
