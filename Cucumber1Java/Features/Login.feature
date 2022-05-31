Feature: Verify QAMAX login page
@Login

Scenario: To verify the login

Given I go to QAMAX webpage
When I select member login
Then I enter data in email field
Then I enter data in password field
And I click on button
Then i go to home page