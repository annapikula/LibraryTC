Feature:As a student, I should be able to see tables with default info
  @Student34
  Scenario: Scenario: Table columns names

    Given the user on the homepage
    Then the user should be see the following column names
      | Actions          |
      | ISBN             |
      | Name             |
      | Author           |
      | Category         |
      |Year              |
      |Borrowed By       |

