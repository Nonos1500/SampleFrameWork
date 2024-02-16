@wip
Feature: Redfin search function
  Agile Story: User search houses within given zipcode and get relative results

  Background: User is on redfin site
    Given User is on redfin home page
    Then User should see Title

  Scenario: User search for houses within wanted zipcode
    When user input the zipcode into the search box
    And user clicks the search button
    Then user sees the zipcode in the headline

