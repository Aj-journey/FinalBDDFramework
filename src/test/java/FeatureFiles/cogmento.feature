@RegressionTest
Feature: Test Cogmento CRM Application

  @LoginPage
  Scenario: validate login functionality
    Given user open url in "chrome" browser
    When user enter valid username and password
    Then user click on login button

  @HomePage
  Scenario: validate home page functionality
    When user is on validate home page logo
    And user validate home page title
    And user validate home page url

  @ContactPage
  Scenario Outline: validate contact page functionality
    When user click on contact link
    And user click on create button
    And user create new contact by reading test data from Excel Sheet "<SheetName>" and <RowNumber>
    And user click on save button

    Examples: 
      | SheetName   | RowNumber |
      | ContactPage |         0 |
      | ContactPage |         3 |
      | ContactPage |         4 |
      | ContactPage |         6 |
