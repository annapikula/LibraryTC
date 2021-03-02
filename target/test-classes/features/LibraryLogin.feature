Feature: Verify both Students and Librarians login

  Background: User is already in login page
    Given user is on the login page

  @librarian
  Scenario: Login as librarian
    When user enters librarian username
    Then user enter librarian password

  @student
  Scenario: Login as student
    When user enters student username
    And user enters student password



