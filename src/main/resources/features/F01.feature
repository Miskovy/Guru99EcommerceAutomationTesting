@smoke
Feature: F01 | Verify item in mobile list page can be sorted by name
  Scenario: Verify item in mobile list page can be sorted by name
    Given user goto "http://live.techpanda.org/index.php/"
    #Expected Result
    And the title of the page shown is "THIS IS DEMO SITE FOR   "
    #Continue Scenario
    And user click on MOBILE button
    #Expected Result
    And the title of the second page shown is "MOBILE"
    #Continue Scenario
    Then user click on sort by dropdown button and choose "Name"
    #Expected Result
    Then all 3 products are sorted by name
