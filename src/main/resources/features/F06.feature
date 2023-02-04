@smoke
Feature: F06 | Verify user is able to purchase product using registered email id
  Scenario: Verify user is able to purchase product using registered email id
    Given user goto "http://live.techpanda.org/index.php/"
    When user click on My account link
    And user login with f05 credentials
    And user click on my wishlist link
    And user next page click add to cart link
    And user enter shipping information
    Then user click Estimate
    #Expected Results
    Then the shipping cost is generated "$5.00"
    #Continue Scenario
    Then user select shipping cost,Update Total
    #Expected Results
    Then Shipping cost is added to total and the total is "$620.00"
    #Continue Scenario
    When user click proceed to checkout button
    And user Enter billing information
    And user click continue in shipping method
    And user select Check money order radio button,and clicks continue
    Then user click Place Order button
    #Expected Result
    Then The order is generated with an order number