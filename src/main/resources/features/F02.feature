@smoke
Feature: F02 | Verify that cost of product in list page and details page are equal
  Scenario: Verify that cost of product in list page and details page are equal
    Given user goto "http://live.techpanda.org/index.php/"
    And user click on MOBILE button
    #Expected Result
    And the cost of Sony Xperia shown is "$100.00"
    #Continue Scenario
    Then user click on Sony Xperia Mobile
    #Expected Result
    Then the price shown is "$100.00"
    And the two prices for both list and page are equal
