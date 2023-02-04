@smoke
Feature: F07 | Verify that you will be able to save previously placed order as a pdf file
  Scenario: Verify that you will be able to save previously placed order as a pdf file
    Given user goto "http://live.techpanda.org/index.php/"
    When user click on My account link
    And user login with f05 credentials
    And user click on my orders link
    And user click on view order button
    #Expected Result
    Then the previously created order is displayed with a pending state
    #Continue Scenario
    Then user click on print order link
    #Expected Result
    Then order is saved as a PDF
