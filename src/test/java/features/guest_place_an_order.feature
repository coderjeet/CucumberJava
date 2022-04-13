Feature: Guest places an order
  This feature is about a guest user placing an order in the site.

  @smoke
  Scenario Outline: using default payment option
    Given I'm a guest customer
    And my billing details are
      | firstname | lastname | country       | address_line1     | city  | state | zip   | email              |
      | demo      | user     | United States | 6300 Spring Creek | Plano | Texas | 75024 | askmodch@gmail.com |
    When I have a "<product_name>" in the cart
    And I'm on the checkout page
    When I provide billing details
    And I place an order
    Then The order should be placed successfully.
    Examples:
      | product_name          |
      | “Blue Shoes”          |
      | “Anchor Bracelet”     |
      | “Blue Shoes”          |
      | “Blue Shoes”          |
      | “Blue Shoes”          |