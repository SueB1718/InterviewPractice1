
@Test@JavaScriptAlerts
Feature: JavaScript Alerts

  Background:

  Scenario:
   Given user is on Java Script Alert page.
When user Clicks on JS Alert Button
  Then asserts alert message.
When user clicks on JS confirm Button and clicks ok on alert.
Then test asserts the alert message.
When user clicks on JS Prompt Button and types a message on Prompt.
Then Test asserts that the alert message contains the typed message.