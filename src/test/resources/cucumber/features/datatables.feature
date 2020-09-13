Feature: Data tables
  Scenario: Bill amount generation
    Given I placed an order for the following items
      |ItemName           | Units | UnitPrice |
      |Cucumber sandwich  | 2     | 20        |
      |Cucumber Salad     | 1     | 15        |
    When I generate the bill
    Then a bill for $40 should be generated

  Scenario Outline: customer bill ammount calculation
    Given I have a custumer
    And user enters initial bill ammount as <BillAmount>
    And sales tax rate is <TaxRate> percent
    Then final bill ammount calculated is <CalculatedBill>
    Examples:
    |BillAmount|TaxRate|CalculatedBill|
    |100       |10     |110           |
    |200       |8      |216           |
    |100       |1.55   |101.55        |