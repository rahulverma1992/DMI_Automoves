#Author: your.email@your.domain.com
Feature: User is able to login and logout from Webmate 

  Scenario Outline: Perform login and logout on Webmate using multiple user
  Given User is on Webmate Login Page
  When User enter "<Email>" and "<Password>"
  Then Verify user is logged in 
  Examples:
  |Email					|Password    |
  |rverma@dmic.com|Testing@321!|