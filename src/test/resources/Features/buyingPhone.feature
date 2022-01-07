Feature: Buying Phone Functionalities

  @buy_test
  Scenario: Buy a Iphone with valid information

    Given user is on Shop home page
    And Click on ShopAll Tab
    And click on Shop all link
    When user click on iphone tab
    And click on Buy Tab
    Then user can buy a phone
