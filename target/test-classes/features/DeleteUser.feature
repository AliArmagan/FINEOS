Feature:Delete User

  @delete_user
  Scenario: Delete user User Name: novak and validate user has been deleted

    Given user is on website
    Then user clicks on X button on User Name row
    Then user clicks on OK button
    Then user verify that User Name deleted
