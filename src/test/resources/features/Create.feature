Feature: Create new task
  Scenario: The user can add new Task
    Given Click add new Tassk
    Given Enter TaskName
    Given Enter TaskDesc
    When Click Save
    Then Task addes successfully