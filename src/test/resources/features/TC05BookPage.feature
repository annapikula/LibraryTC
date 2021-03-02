Feature:As a librarian, I should be able to see book records on user page

  Background: User is logged in a Librarian
    Given User is logged in as Librarian
    And User opens book tab

  Scenario: Verify that the default record is 10
    Then The default amount of books shown is 10

  @wip
  Scenario Outline:Show records for <count> options and <result> should populate
    When The user clicks the count dropdown and Selects "<count>"

    Then the amount "<result> is displayed
    Examples:
      | count | result |
      | 5     | 5      |
      | 10    | 10     |
      | 15    | 15     |
      | 50    | 50     |
      | 100   | 100    |





