#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.

Feature: Create user and Delete user  Functionality
Description this feature validates login and logout ,Create user and Delete user functionalities

@Execute
Scenario: Login with valid credentials
Given I launch the chrome browser
And I navigate the Application url
When I enter the username in username text field
And I enter the password in password text field
And I click on login button
And I click on minimize flyout window

@Execute
Scenario: Create user Scenario
 Given I Click create user
And I Click Add user
Then I find create User page
When I Enter First name in firstName text field
And I Enter Last Name in lastName text field
And I Enter Email in email Text field
And I Enter uername in username Text field
And I Enter Password in password Text field
And I Enter  Password in RetypepassWord Field
And I click Add user

Scenario: Modify user Scenario
Given I Select User
And I Modify the Username 
Then I Find the save changes option
When I save the changes


Scenario: Delete User Scenario
Given I Select User
Then I Find the Delete button
When I Click Delete button
And I Deleted completely
 
Scenario: Logout functionality
Then I find the home page
When I click on logout link
Then I find the login page
And I close Application
