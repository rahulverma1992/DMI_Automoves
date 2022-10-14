Feature: Verify if user is able to deploy devices on available Deskstop Slot
Scenario: Deploy devices on available Deskstop Slot
    Given User is on Webmate Devices Page.
    When User is at devices slots in Project Page
    Then User select available deskstop devices and deploy on it