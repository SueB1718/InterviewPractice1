
@FileUpload
Feature: File Upload
  Test uses Upload Button or Drag and Drop to upload a file.
  Test asserts that the file is uploaded.

  Background:
    Given User is on file upload page

  Scenario:
  Test uses Upload Button to upload a file.
  Test asserts that the file is uploaded.
    When user clicks Choose File button and select a file.
    And user clicks Upload button
  Then user see file is uploaded

  Scenario:
  Test uses Drag and Drop to upload a file.
  Test asserts that the file is uploaded.
    When user clicks Choose File button and select a file.
    And user uses Drag and Drop and clicks Upload button
#    Then user see file is uploaded //-> press command slash /
