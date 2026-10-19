Feature: To vaalidate the login functionality

  # Scenario: To verify login with valid username and password
  # Given User has to launch the browser and hit the saucedemo url
  # When User has to enter email in email field
  # And User has to enter the password in password field
  # And User has to click the login button
  # And User has enter into home page or not
  # Then User has to close the browsers
  
  
  Scenario Outline: To verify login with positive and negative combination
    Given User has to launch the browser and hit the saucedemo url
    When User has to enter email "<username>" in email field
    And User has to enter the password "<password>" in password field
    And User has to click the login button
    And User has enter into home page or not
    Then User has to close the browsers

    Examples:
      | username        | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
      | problem_user    | secret_sauce |
