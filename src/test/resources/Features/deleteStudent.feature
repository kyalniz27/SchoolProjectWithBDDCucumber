Feature: Test delete functionality for inactive student

 Background:
    Given user is on login page

  @delete
  Scenario: Verify delete text of inactive user
    When user clicks on sign in button
    And user enters 'm.koklu@sany.org' and "2121" and click on login button
    Then user is navigated to teacher page
    When I click on admin tasks link to go to the admin page
    And I input user name and password and click login on admin page
    Then I verify that the user is on admin page
    When I click on organization dropdown and select students
    When I want to see all '100' students on the page
		And I click on delete icon to delete an inactive student
		Then I verify 'Kayıt silinecek!' alert message is displayed