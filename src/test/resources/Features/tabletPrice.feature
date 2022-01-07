Feature: Tablet Price Functionalities

  @price_test
  Scenario Outline: Validating the Tablet Price

    Given user is on Shop_Home1 page
    And click on Prepaid tab
    And click on Devices tab
    And clicks on Tablets Tab
    When user select the choices "<choice>" of the Tablet
    And click on Quick View of the Tablet
    Then user can see the price details of the Tablet

    Examples:
      |choice        |
      |Price Low-High|
