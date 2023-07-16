Feature: test calculator
  Background: open the app
    Given open the calculator app

    @smokeTest
    Scenario: Verify total of the number
      Given Click to number one
      And Click to plus button
      And Click to number two
      When Click to equal button
      Then The result should be three

      @RegressionTest
    Scenario: verify home page
      Given open the browser
      And navigate to google.com
      And input text "automation test"
      When click to search button
      Then The result should be show