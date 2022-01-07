Feature: Customer Care Functionalities

  @contact_test
  Scenario: Validating Customer Care Response

    Given user is on Support_home Page
    And click on contact Us Tab
    And click on Mobile Device Tab
    When user click on International Travel Tab
    And click on Chat With us
    Then user can chat with Customer care Assistant
