Feature: To validate with mapping cred

  Scenario: To verfiy the username with data tables
    Given User has to launch the browser and hit the url
    And User has to enter email id
      | 12345  | visual_user  | 123456   |
      | 222345 | visual_users | 12123456 |
    And User has to enter password
      | Password 1 | Test1234     |
      | Password 2 | Test321      |
      | Password 3 | secret_sauce |
    And User has enter password again using two dimensional format
      | Password 1 | Password 2   | Password 3   |
      | 12345      | visual_user  | secret_sauce |
      | 222345     | secret_sauce | 12123456     |
    Then User has to close the browser
