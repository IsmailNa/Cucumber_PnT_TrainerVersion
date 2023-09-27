@TutorialsNinjaRegister
Feature: Register functionality

@MandatoryFields
Scenario: Register Account With Mandatory Fields
    Given User navigates to RegisterPage
    When User enters firstname "Selenium" into firstname field
    And User enters lastname "Panda" into lastname field
    And User enters email "seleniumpanda2009100920091009@gmail.com" into email field
    And User enters telephone "9876543210" into telephone field
    And User enters password "Selenium@123" into password field
    And User enters password "Selenium@123" into confirmpassword field
    And User checks on PrivacyPolicy checkbox
    And User clicks on Continue Button
    Then User account gets created successfully
   