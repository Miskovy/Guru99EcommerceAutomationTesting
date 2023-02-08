@smoke
Feature: F12 | Verify the product review mechanism
  Scenario: Verify the product review mechanism
    Given user goto "http://live.techpanda.org/index.php/review/product/list/id/1/"
    When user fill the required review and submit it
    Then user goto "http://live.techpanda.org/index.php/backendlogin"
    And user login with "user01" and "guru99com"
    And user goto Catalogue,Reviews and Ratings,Customer Reviews,Pending Reviews Menu
    And user sort table by Id and select comment then click on Edit link
    And user Change status to "Approved" and click Save Review
    And user goto "http://live.techpanda.org/"
    And user click on MOBILE button
    And user click on Sony Xperia Image
    And In detail page, user click on Review tab at bottom of page
    #Expected Result
    Then user Verify the review comment is shown
