@smoke
Feature: F05 | Verify you can create account in E-commerce site and can share wishlist to other people using email
  Scenario: Verify you can create account in E-commerce site and can share wishlist to other people using email
    Given user goto "http://live.techpanda.org/index.php/"
    When user click on My account link
    And user click Create account and fill new user information except Email ID
    And user click Register
    #Expected Results
    Then Registration is done
    #Continue Scenario
    Then user goto TV menu
    And user add product to wishlist which is LG LCD
    And user click share whishlist
    Then In-next page user enter E-mail and a message and click share wishlist
    #Expected Results
    Then wishlist is shared
