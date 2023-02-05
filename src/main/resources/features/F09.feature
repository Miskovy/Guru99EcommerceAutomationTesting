@smoke
Feature: F09 | Verify Discount Coupon works correctly
  Scenario: Verify Discount Coupon works correctly
    Given user goto "http://live.techpanda.org/index.php/"
    When user goto mobile and add IPHONE to cart
    And user enter coupon code "GURU50"
    #Expected Result
    Then the price is discounted by "5%"
