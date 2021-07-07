
@Test@DynamicContent
Feature: Dynamic Content

Test refreshes (clicks) the page a couple of times.
Test asserts that the content changes on each refresh.


  Scenario:
    Given user is already on Dynamic Content page
  When  user clicks on the click here a couple of times.
  Then  content changes on each refresh.