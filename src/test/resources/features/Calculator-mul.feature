Feature: Multiply two numbers with a Calculator
  In order to not learn math
  As someone who is bad at math
  I want to be able to multiply numbers using a Calculator

  Scenario: Multiply two numbers
    Given I have a Calculator
    When I multiply -2 and 5
    Then the result should be -10