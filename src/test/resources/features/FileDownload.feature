
@Test@FileDownload
Feature: File Download


  Scenario:
    Given user is on the File Download page
    When user  clicks on the file.
    Then asserts that the file is downloaded.