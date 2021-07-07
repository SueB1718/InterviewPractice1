
  @Test
  Feature: Open in New Tab

    Scenario:Open in New Tab

    Test clicks on the Click Here link.
    Test asserts that a new tab is opened with text New Window.
      Given user is on Open in New Tab page
      When user clicks on the Click Here link.
     Then asserts that a new tab is opened with text New Window.
