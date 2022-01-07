Feature: Devices Checking Functionalities

  @deviceValidation_test
  Scenario: Validating the supported Devices

    Given user is on Support home Page
    And clicked on SupportOverView
    When user clicked on DeviceSupport
    And clicked on SeeAllDevices
    Then user can see all the supported devices
