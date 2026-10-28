Feature: To validate the login functionality

  Background:
    Given User has to launch the browser and hit the saucedemo url

  Scenario: To verify login with visual_user username and password
    # Given visual_user has to launch the browser and hit the saucedemo url
    When visual_user has to enter email in email field
    And visual_user has to enter the password in password field
    And visual_user has to click the login button
    And visual_user has enter into home page or not
    Then visual_user has to close the browsers

  Scenario Outline: To verify login with positive and negative combination
    # Given User has to launch the browser and hit the saucedemo url
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
