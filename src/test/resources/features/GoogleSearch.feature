Feature: Make a search in google.com
  In order to search a particular word
  As a valid user
  I want to get valid results after the search

  Scenario Outline: Search sucessfully on google.com
    Given I am in the google.com webpage
    When I enter a <textToSearch> and press Enter key
    Then I should be in the correct results page

    Examples: 
      | textToSearch             |
      | "testing"                |
      | "testing my application" |
