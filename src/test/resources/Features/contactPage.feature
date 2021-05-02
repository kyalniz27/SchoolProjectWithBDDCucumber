Feature: contact page test

  Background:
    Given guest is on login page

  @Contact
  Scenario: checking contact page
    When guest clicks on contact us button
    Then guest enters fullname,email and message
      | fullname       | email              | message      |
      | Mustafa  Koklu | m.koklu@sany.org   | Hello World! |
