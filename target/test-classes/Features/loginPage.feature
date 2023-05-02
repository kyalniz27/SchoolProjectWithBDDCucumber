Feature: Login page feature

  Background: 
    Given user is on login page

  @valid
  Scenario: Verify login page with valid credentials
    When user clicks on sign in button
    And user enters 'm.koklu@sany.org' and "2121" and click on login button
    Then user is navigated to teacher page

  @invalid
  Scenario: Verify login page with invalid credentials
    When user clicks on sign in button
    When user enters invalid 'test123@gmail.com' or 'test123' and click on login button
    Then user sees 'Invalid email address or password' error message

  @logout
  Scenario: Verify user log out successfully
    When user clicks on sign in button
    And user enters 'm.koklu@sany.org' and "2121" and click on login button
    Then user is navigated to teacher page
    When I click on log out button
		Then I verify I logged out successfully