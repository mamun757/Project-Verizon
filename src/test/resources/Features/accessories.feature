Feature: Accessories Functionalities

  @display_test
  Scenario Outline: Validating the Accessories Display

    Given user is on Shop_home1 page
    And click on Accessories tab
    And click on Phone accessories tab
    And clicks on Cases Tab
    When user select the choice "<choices>" of cases
    Then user validate the actual image of accessories

    Examples:
    |choices|
    |Newest|





