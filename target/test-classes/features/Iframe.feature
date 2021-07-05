
Feature: Iframe

  @Iframe
  Scenario: Test switches to Iframe and types some text.
  Test asserts that the typed text is as expected.

    Given User is on Ifram page
    When user switches to Iframe and types some text.
  Then the typed text is as expected.
