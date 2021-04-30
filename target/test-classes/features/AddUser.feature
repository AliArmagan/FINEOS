Feature:Add user
@add_user
Scenario:As a user I should be able to 'Add user'
Given user is on website
And user clicks on Add User button
Then user adds new user information
Then user clicks on save button
Then user verify that new user name on the table

