@smoke
Feature: F14 | Verify Search Functionality
  Scenario: Verify Search Functionality
    Given user goto "http://live.techpanda.org/index.php/"
    When user click on Advanced Search
    And In Price field user enter range 0-150 and Click Search
    And user Note the Price and Product Name in the result and Print on console
    And Again, In Price field user enter range 151-1000 and Click Search
    And user Note again the Price and Product Name in the result and Print on console

