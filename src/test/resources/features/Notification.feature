@Test@NotificationMessage
Feature:  Notification Message


  Scenario:
  Test clicks on the Click Here link a multiple times.
  Test asserts that one of the “Action Successful”, “Action unsuccessful, please try again” and “Action Unsuccessful” messages show on click.
    Given user is on Notification Message page.
    When  user clicks on the Click Here link a multiple times.
    Then  asserts that one of the “Action Successful”, “Action unsuccessful, please try again” and “Action Unsuccessful” messages show on click.