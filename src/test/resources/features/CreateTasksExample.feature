Feature: Create new tasks
  Scenario Outline: The user can add new Tasks
    Given Click add new Tassk
    Given Enter "<TaskDesc>" and "<TaskDec>"
    Then Task added successfully
    Examples:
      |TaskDesc   |TaskDec|
      |Cucumber 1 |Tast 1 |
      |Cucumber 2 |Tast 2 |


