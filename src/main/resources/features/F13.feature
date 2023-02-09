@smoke
Feature: F13 | Verify Sort is working correctly
  Scenario: Verify Sort is working correctly
    Given user goto "http://live.techpanda.org/index.php/backendlogin"
    When user login with "user01" and "guru99com"
    And And user goto sales and selects invoices menu
    And user sort Invoice Date Column in ascending and descending order and user Verify the sort is working as expected

