Feature: Search

  @search @search_01
  Scenario Outline: Search for Pablo Leal on LinkedLn
    Given A user navigates to HomePage "es"
    When a user searches for "Jose pablo leal bautista Linkedln"
    Then "Pablo Leal" is displayed in the first "<nbOfResultsToSearch>" results
    Examples:
      | nbOfResultsToSearch |
      | 3                   |