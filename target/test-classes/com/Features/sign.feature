@validate
Feature: Login Page Functionality

@smoke
  Scenario: Postive LogIn Test
    #Given User launch the browser and URL
    And User enter the correct username as "Vigneshraj07"
    And User enter the correct password as "7094862477"
    When User click on the submit button
    Then User verifies the new page contains  expected URL
    And User verifies new page contains expected text
    And User verifies Logout button is displayed on the page

@reg
  Scenario: Negative Username Test
    #Given User launch the browser and URL
    And User enter the incorrect username as "VigneshrajN"
    And User enter the correct password as "7094862477"
    When User click on the submit button
    But User verifies error message is displayed
    And User verifies error message text is Invalid Login details

@test 
  Scenario: Negative Password Test
    #Given User launch the browser and URL
    And User enter the correct username as "Vigneshraj07"
    And User enter the incorrect password as "709486247"
    When User click on the submit button
    But User verifies error message is displayed
    And User verifies error message text is Invalid Login details
    #And user close the browser
