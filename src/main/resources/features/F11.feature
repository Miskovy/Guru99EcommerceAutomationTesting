@smoke
Feature: F11 | Verify invoice can be printed
  Scenario: Verify invoice can be printed
    Given user goto "http://live.techpanda.org/index.php/backendlogin/"
    When user login with "user01" and "guru99com"
    And user goto sales and selects orders menu
    And user select "Canceled" in status dropdown
    And user select the checkbox next to first order
    And In Actions, user select Print Invoices and Click Submit
    #Expected Result
    Then Error message "There are no printable documents related to selected orders." is shown
    #Continue Scenario
    Then In the status field user select "Complete" and Click Search
    And the user Select the checkbox next to first order
    And In Actions, user select Print Invoices and Click Submit
    #Expected Result
    Then Invoice is downloaded
