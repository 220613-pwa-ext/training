Feature: Login

#  Scenario: Successful Login as Student
#    Given that I am at the login page
#    When I type a valid username for a student
#    And a valid password for the student
#    And I click login
#    Then I should be redirected to the student homepage

  Scenario Outline: Successful Login
    Given that I am at the login page
    When I type in a valid username of <un>
    And a valid password of <pw>
    And I click login
    Then I should be redirected to the <pagename> homepage

    Examples: Student credentials
    | un       | pw            | pagename |
    | john_doe | password12345 | student  |
    | jane_doe | pass123       | student  |
    | bachy21  | password123   | teacher  |

    # This is an example of "data-driven" testing, whereby we parameterize our data for the test cases

  Scenario: Invalid username, invalid password
    Given that I am at the login page
    When I type an invalid username of "user123"
    And I type an invalid password of "32423#$#$#lkjf"
    And I click login
    Then I should see an error message of "Invalid username and/or password"

  Scenario: Valid username, invalid password
    Given that I am at the login page
    When I type a valid username of "bachy21"
    And I type an invalid password of "12345"
    And I click login
    Then I should see an error message of "Invalid username and/or password"

  Scenario: Invalid username, valid password
    Given that I am at the login page
    When I type an invalid username of "user123"
    And I type a valid password of "password123"
    And I click login
    Then I should see an error message of "Invalid username and/or password"