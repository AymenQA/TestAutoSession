Feature: Authentication

  Scenario: with correct username and wrong password
    Given I visit the-internet.herokuapp.com/login
    When I enter correct user name as "tomsmith" and wrong password as "wrong password" in the user name and password field
    And I press the login button
    Then I should see the Your password is invalid!

  Scenario: with correct username and correct password
    Given I visit the-internet.herokuapp.com/login
    When I enter correct user name and correct password in the user name and password field
    And I press the login button
    Then I should see the You logged into a secure area!