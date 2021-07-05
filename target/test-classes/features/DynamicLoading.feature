Feature: Dynamic Loading

  @DynamicLoading
  Scenario:
Given User is on Dynamic Loading page
 When user clicks the start button and uses explicit wait.
Then Test asserts that “Hello World!” text is displayed.