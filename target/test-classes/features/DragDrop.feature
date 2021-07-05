Feature: Drag And Drop

  @DragandDrop
  Scenario: Test drags element A to element B.
  Test asserts that the text on element A and B are switched.

    Given  user is already on Drag and Drop page
    When  user drags element A to element B
    Then text on element A and B are switched.
