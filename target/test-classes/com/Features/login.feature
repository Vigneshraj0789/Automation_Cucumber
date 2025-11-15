#Feature: Login Page Functionality

  #Scenario: Postive LogIn Test
  #Given User launch the browser and URL
  #And User enter the correct username
  #And User enter the correct password
  #When User click on the submit button
  #Then User verifies the new page contains  expected URL
  #And User verifies new page contains expected text
  #And User verifies Logout button is displayed on the page
  #
  #Scenario: Negative Username Test
  #Given User launch the browser and URL
  #And User enter the incorrect username
  #And User enter the correct password
  #When User click on the submit button
  #But User verifies error message is displayed
  #And User verifies error message text is Invalid Login details
  #
  #Scenario: Negative Password Test
  #Given User launch the browser and URL
  #And User enter the correct username
  #And User enter the incorrect password
  #When User click on the submit button
  #But User verifies error message is displayed
  #And User verifies error message text is Invalid Login details
  #Scenario: Postive LogIn Test
  #Given User launch the browser and URL
  #And User enter the correct username as "Vigneshraj07"
  #And User enter the correct password as "7094862477"
  #When User click on the submit button
  #Then User verifies the new page contains  expected URL
  #And User verifies new page contains expected text
  #And User verifies Logout button is displayed on the page
  #
  #Scenario: Negative Username Test
  #Given User launch the browser and URL
  #And User enter the incorrect username as "VigneshrajN"
  #And User enter the correct password as "7094862477"
  #When User click on the submit button
  #But User verifies error message is displayed
  #And User verifies error message text is Invalid Login details
  #
  #Scenario: Negative Password Test
  #Given User launch the browser and URL
  #And User enter the correct username as "Vigneshraj07"
  #And User enter the incorrect password as "709486247"
  #When User click on the submit button
  #But User verifies error message is displayed
  #And User verifies error message text is Invalid Login details
  #Scenario: Postive LogIn Test
  #Given User launch the browser and URL
  #And User enter the correct username password
  #|Vigneshraj07|7094862477|
  #When User click on the submit button
  #Then User verifies the new page contains  expected URL
  #And User verifies new page contains expected text
  #And User verifies Logout button is displayed on the page
  #
  #Scenario: Postive LogIn Test
  #Given User launch the browser and URL
  #And User enter the correct username password
  #|username|password|
  #|Vigneshraj07|7094862477|
  #When User click on the submit button
  #Then User verifies the new page contains  expected URL
  #And User verifies new page contains expected text
  #And User verifies Logout button is displayed on the page
  #
  #Scenario Outline: : Postive LogIn Test
    #Given User launch the browser and URL
    #And User enter the correct "<username>"  "<password>"
    #When User click on the submit button
    #Then User verifies the new page contains  expected URL
    #And User verifies new page contains expected text
    #And User verifies Logout button is displayed on the page
#
    #Examples: 
      #| username     | password   |
      #| Vigneshraj07 | 7094862477 |
      #| VigneshrajN  | 7094862477 |
      #| Vigneshraj07 |  709486247 |
