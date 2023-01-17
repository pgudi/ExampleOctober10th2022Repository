#Author: your.email@your.domain.com
# Feature Id:
# Purpose:

Feature: login and logout functionality New

Scenario: Verify the login functionality
Given I launch the chrome browser
And I navigate the application url
When I enter the username in username text field
And I enter the password in password text field
And I click on login button
Then I find the home page
And I minimize the flyout window

Scenario: Verify the logout functionality
Given I find the home page
When I click on logout link
Then I find the login page
And I close the Application