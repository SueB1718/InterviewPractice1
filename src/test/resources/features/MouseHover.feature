
Feature: Mouse Hover

  @MouseHover
  Scenario:
Test does a mouse hover on each image.
Test asserts that additional information is displayed for each image.

    Given user is on mouse page
    When user does a mouse hover on each image.
  Then additional information is displayed for each image.