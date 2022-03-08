Feature: Login feature

  Scenario: Login page title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Account login"

  Scenario: Forgot password link
    Given user is on login page
    Then forgot password link should be displayed

  Scenario: Login with correct credentials
    Given user is on login page
    When user enters username "naveenanimation20@gmail.com"
    And user enter password "Selenium@12345"
    And user clicks on Login Button
    Then user gets the title of the page
    And page title should be "My Account"
