@smoke
Feature: F04 | Verify that you are able to compare two product
  Scenario: Verify that you are able to compare two product
    Given user goto "http://live.techpanda.org/index.php/"
    And user click on MOBILE button
    Then user click on compare for both Sony Xperia and Iphone
    When user click on Compare btn
    #Expected Results
    Then A Popup window opens with heading "COMPARE PRODUCTS" and the selected products are in it
    #Continue Scenario
    Then Close the popup window
