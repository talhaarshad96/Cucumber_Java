#Author: Talha Arshad.
#@Smokescenario
Feature: Test login functionality

  #@Smoke
  Scenario: Check login is successful with valid credetials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
#
  #Scenario Outline: Check login is successful with valid credetials
    #Given user is on login page
    #When user enters <username> and <password>
    #And clicks on login button
    #Then user is navigated to the home page
#
    #Examples: 
      #| username | password |
      #| User1    | pass1    |
      #| User2    | pass2    |
