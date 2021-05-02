Feature: Login page feature

  Background:
    Given user is on login page

  @Teacher1
  Scenario: Verify login page with valid credentials
    When user clicks on sign in button
    And user enters 'm.koklu@sany.org' and "2121" and click on login button
    Then user is navigated to teacher page


    @Teacher2
  Scenario: Verify login page with invalid credentials
    When user clicks on sign in button
    When user enters invalid 'test123@gmail.com' or 'test123' and click on login button
    Then user sees alert message





