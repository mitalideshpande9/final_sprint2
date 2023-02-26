Feature: Search a term to find the corresponding results
  Scenario: verify that search results are relevant to the search query.
    Given the user enters product name
    When corresponding search results should be displayed
    Then search results should be same as search query

  Scenario: verify that search box accepts input from the user.
    Given the user opens valid url
    When the user enters valid product name
    Then user is able to enter the query

  Scenario: test the search functionality for special characters
    Given the user enters product name with special characters
    When corresponding search results should be displayed with error
    Then error message should be displayed

  Scenario: test search functionality for invalid search
    Given the user enters invalid product name
    When corresponding search results should be displayed with message
    Then error message should be displayed in box

  Scenario: Verify the search functionality by searching the term in upper case
    Given the user enters product name in upper case
    When corresponding search results should be displayed same as correct product
    Then search results should be displayed successfully


#  Scenario Outline: Verify that user is able to search for different category
#    Given User is on Bewakoof page
#    When user enters "<category>" in search query
#    Then user should get possible number of results "<results>"
#    Examples:
#      | category      | results                 |
#      | MEN           | 6837 results were found |
#      | WOMEN         | 3257 results were found |




