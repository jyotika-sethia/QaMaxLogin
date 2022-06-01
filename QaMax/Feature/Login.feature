Feature: Login to Website

@LoginWebsite
Scenario: Enter as valid user 

Given I got to QaMax
When I click member login
Then I enter valid username 
And I enter valid password
Then I click on Login button
Then I go to the home page
