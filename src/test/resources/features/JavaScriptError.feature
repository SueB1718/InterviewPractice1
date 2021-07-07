
@Test@JavaScriptError
Feature: JavaScript Error


  Scenario:   Test finds the JavaScript error on the page.
  Test asserts that the page contains error: Cannot read property 'xyz' of undefined.

  Given user is on Java Script Error page.
    When user finds the JavaScript error on the page.
    Then asserts that the page contains error: Cannot read property 'xyz' of undefined.
