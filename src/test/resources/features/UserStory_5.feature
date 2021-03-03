Feature: As a librarian, I should be able to see book records on user page


  @UserStory5
  Scenario: Verify that the default record is 10
    Given user is on the login page
    When user enters student username
    And user enters student password
    Then user should see 10 in default

 @UserStory_5
  Scenario: show record for <count> options
    When I click <count> it should show
      | 5     |
      | 10    |
      | 15    |
      | 100   |


