Feature:Add user
@add_user
Scenario:As Admid user I should be able to 'Add user'
Given user is on website
And user clicks on Add User button
Then user adds new user information
 # |First Name  | Alex |
 # |Last Name   | Alex |
 # |User Name   | Alex |
 # |Password    | 1234 |
 # |Customer    | AAA  |
 # |Role        | Admin|
 # |E-mail      | aa@aa.aa |
 # |Cell Phone  | 321321 |
Then user clicks on save button
Then user verify that new user name on the table

