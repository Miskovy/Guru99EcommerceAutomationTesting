@smoke
Feature: F03 | Verify that you cannot add more product in cart than the product available in store
  Scenario: Verify that you cannot add more product in cart than the product available in store
    Given user goto "http://live.techpanda.org/index.php/"
    And user click on MOBILE button
    Then user click on add to cart for Sony Xperia
    When user change QTY value to "1000" and click update button
    #Expected Result
    Then the error message shown is "* The maximum quantity allowed for purchase is 500." and another message is "Some of the products cannot be ordered in requested quantity."
    #Continue Scenario
    Then user click on empty cart link in the footer of list of all mobiles
    #Expected Result
    Then a message shown is "SHOPPING CART IS EMPTY"
