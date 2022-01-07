Feature: Login Functionalities

  Background:
    Given user is on Verizon HomePage
    And user should clicked on SignIn button
    And user clicked on SignInToMyAccount Tab



  @negative_test
  Scenario Outline: Login is unsuccessful with invalid credentials
    When user enters username "<username>" and password "<password>"
    And click on SignIn button
    Then user is failed to login

    Examples:
    |username|password|
    |mamun757|123456  |

  @positive_test
  Scenario Outline: Login is successful with valid credentials
    When user enters username "<username>" and password "<password>"
    And click on SignIn button
    Then user will successfully landed to Verizon Home page

    Examples:
      |username          |password      |
      |mamun757@gmail.com|M7573572sin$  |