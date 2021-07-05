
@DynamicControls
Feature: Dynamic Controls

  Background:
    Given user is on the Dynamic Controls page

    Scenario: As user clicks on the Remove/Add button, either one is present.

    When user clicks on the Remove Button and uses explicit wait.
      Then  test asserts the checkbox is gone.
    And Test clicks on Add Button and uses explicit wait.
Then Test asserts that the checkbox is present.

     Scenario: user clicks on the Enable/Disable Button

When user clicks on the Enable Button and uses explicit wait.
Then Test asserts that the text box is enabled.
And Test clicks on the Disable Button and uses explicit wait.
Then Test asserts that the text box is disabled.



