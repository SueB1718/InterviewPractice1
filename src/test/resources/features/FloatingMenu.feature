Feature: Floating Menu

  @FloatingMenu
  Scenario: Test scrolls the page.
  Test asserts that the floating menu is still displayed.
    Given user is on the Floating Menu page
    When user scrolls the page
  Then floating menu is still displayed.