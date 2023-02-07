@smoke
Feature: F10 | Export all Orders in csv file and display these information in console and you are able to send this file to another email id as attachment
  Scenario: Export all Orders in csv file and display these information in console and you are able to send this file to another email id as attachment
    Given user goto "http://live.techpanda.org/index.php/backendlogin/"
    When user login with "user01" and "guru99com"
    And user goto sales and selects orders menu
    And user select CSV in export to dropdown and click export button
    #Expected Result
    Then the downloaded file is read and displayed all order information in console windows
