Feature: Search

  @search @search_01
  Scenario Outline: Search cucumber studio
    Given A user navigates to HomePage "es"
    When a user searches for "Jose pablo leal bautista Linkedln"
    Then "Pablo Leal" is displayed in the first "<nbOfResultsToSearch>" results
    Examples:
      | nbOfResultsToSearch |
      | 3 |