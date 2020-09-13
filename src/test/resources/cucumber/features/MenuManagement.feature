Feature: Menu Managment

  Scenario: Add a menu item
    Given I have a menu item with name "Cucumber Sandwich" and price $20 dollars
    When I add that menu item
    Then the menu item with name "Cucumber Sandwich" should be added