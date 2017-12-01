Feature: Some terse yet descriptive text of what is desired
  In order to realize a named business value
  As an explicit system actor
  I want to gain some beneficial outcome which furthers the goal

  Scenario Outline: Search google
    Given I have been connected on google
    When I search '<keyword>'
	Then I should only see items containing '<keyword>'
    
  Examples:
    | keyword |
    |  patateDouce |
    | general  |