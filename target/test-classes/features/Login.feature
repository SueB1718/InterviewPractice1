
@Test@Login
Feature: Login feature // explain
  As a user, I should be able to login with correct credential
  As a user, I should fail to login with wrong credential


  Background: User is already in Login page // explain
    Given user is on the login page


    Scenario: Login with correct credential // explain
     // Given user is on the login page
      When user enters correct username
      And user enters correct password
    And user click login button
      Then log in successfully

  @Login
  Scenario: Login with wrong credential // explain
  // Given user is on the login page
    When user enters incorrect username
    And user enters incorrect password
    And user click login button
    Then log in fails


