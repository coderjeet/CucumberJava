@featured
Feature: Add to cart

  @rule1
  Rule: Add from store

    @regression1
    Scenario: Scenario 1
    Its a description of the scenario that we are building and validating.

      Given I'm on the store page
      When I add a "“Blue Shoes”" to the cart
      Then I see 1 "Blue Shoes" in the cart

    @regression2
    Scenario Outline: Scenario 1
    Its a description of the scenario that we are building and validating.

      Given I'm on the store page
      When I add a "<product_name>" to the cart
      Then I see 1 "<product_validation>" in the cart
      Examples:
        | product_name                      |                  product_validation                        |
        | “Anchor Bracelet”                 |                  Anchor Bracelet                           |
        | “Black Over-the-shoulder Handbag” |                  Black Over-the-shoulder Handbag           |