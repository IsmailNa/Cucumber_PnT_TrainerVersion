
@TutorialsNinjaLogin
Feature: Login functionality

@ValidCredentials
Scenario: Login With Valid Credentials
    Given User navigates to LoginPage
    When User enters valid email "seleniumpanda@gmail.com" into email field
    And User enters valid password "Selenium@123" into password field
    And User clicks on Login button
    Then User successfully logins into AccountPage

