@TutorialsNinjaSearchProduct
Feature: SearchProduct Functionality

@ValidProduct
Scenario: User searches for a valid product
Given User navigates to the HomePage
And User enters valid product "HP" into search box field
And User clicks on Search button
Then User gets valid product display in search results and system navigates to SearchPage