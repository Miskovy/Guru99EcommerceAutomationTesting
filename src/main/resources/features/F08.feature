@smoke
Feature: F08 | Verify you are able to change or reorder previously added product
  Scenario: Verify you are able to change or reorder previously added product
    Given user goto "http://live.techpanda.org/index.php/"
    When user click on My account link
    And user login with f05 credentials
    And user click REORDER link , change QTY to "10" and click update
    #Expected Result
    Then Grand Total is changed to "$6,150.00"
    #Continue Scenario
    Then user complete Billing and Shipping Information
    #Expected Result
    Then The order is generated with an order number
