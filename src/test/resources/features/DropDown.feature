Feature: Dropdown feature
  @Dropdown
  Scenario:
  Test selects Option 1 and Option 2 from the drop down menu.
  Test asserts Option 1 and Option 2 are selected.

    Given user is on the Dropdown page
    When user selects Option 1 and Option 2
    Then user asserts Option 1 and Option 2 are selected.
    