Feature: TradeIn Functionalities

  @tradeIn_test
  Scenario Outline: Calculate the Trade in value
    Given user is on Support home_page
    And clicked on SupportOverViewTab
    And click on Trade in my device tab
    And click on smart Phone tab
    When user select brand "<brand>" and model "<model>"
    And user select storage "<storage>" and network "<network>"
    And click on continue1 button
    And clicked on GoodCondition Radio button
    And click on continue2 button
    Then the trade in value is "Your estimated trade-in value is $185.00."

    Examples:
    |brand|model|storage|network |
    |Apple|iPhone 11|64GB|Sprint |




