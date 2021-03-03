@wip
Feature: users should have access to the correct modules

  Scenario: Students should have access to 2 modules




    Given the student on the home page
    Then the student should see following modules
      | Books           |
      | Borrowing Books |


  Scenario:Librarians  should have access to 3 modules
    Given the librarian on the homepage
    Then the librarian should see following modules
      | Dashboard |
      | Users     |
      | Books     |
