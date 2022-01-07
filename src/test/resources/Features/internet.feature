Feature: Internet Availability Functionalities

  @internetAvailability_test
  Scenario Outline: Validating the internet is available in selected address

    Given  user is on Shop_home2 page
    And click on Home tab
    And click on Shop All Home Solution tab
    And click on Internet Service button
    When click on Here button
    And set his living address "<address>" field

    Then user get an message

    Examples:
    |address                       |
    |15918 88th aa jamaica Ny 11432|


