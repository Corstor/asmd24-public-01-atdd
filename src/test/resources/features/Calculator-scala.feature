Feature: Create a full calculator
  Create a calculator that adds, multiplies,
  divides and subtracts two numbers

  Scenario: Add two numbers
    Given I have a Calculator in scala
    When I add 2 and -3 in scala
    Then the result should be -1 in scala
    
  Scenario: Add three numbers
    Given I have a Calculator in scala
    When I add 2 and 5 and -3 in scala
    Then the result should be 4 in scala