
@Test@ContextMenu
Feature: Context Menu

  Background: User is already on Context Menu page
    Given user is on Context Menu page

    Scenario: Test right clicks on the context menu.
    Test asserts the alert menu text.

When User right clicks on the context menu.
And  the alert menu text pops up.
      Then  asserts the alert menu text.
