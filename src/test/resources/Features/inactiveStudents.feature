Feature: Verify inactive students

 Background:
    Given user is on login page

  @inactive
  Scenario: Verify inactive students in the system
    When user clicks on sign in button
    And user enters 'm.koklu@sany.org' and "2121" and click on login button
    Then user is navigated to teacher page
    When I click on admin tasks link to go to the admin page
    And I input user name and password and click login on admin page
    Then I verify that the user is on admin page
    When I click on organization dropdown and select students
    When I want to see all '100' students on the page
    Then I verify inactive students in the course