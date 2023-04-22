Feature: contact page test

  Background: 
    Given guest is on login page

  @contact
  Scenario: checking contact page
    When guest clicks on contact us button
    And guest enters 'fullname','email' and 'message'
    And guest cliks on send button to send the message 
    
     #| fullname      | email            | message      |
      #| Mustafa Koklu | m.koklu@sany.org | Hello World! | 
