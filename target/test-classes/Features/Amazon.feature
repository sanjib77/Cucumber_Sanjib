Feature: Amazon Application

  @tag1
  Scenario: Amazon Add to cart
    Given Navigate to Amazon Home Page
    When Search for product "AC"
    And Open the Prefered Product
    Then Click Add to cart button

  Scenario Outline: Amazon Add to cart
    Given Navigate to Amazon Home Page
    When Search for product "<product>"
    And Open the Prefered Product
    Then Click Add to cart button

    Examples: 
      | product     |
      | Room Heater |

  Scenario Outline: Amazon Add to cart
    Given Navigate to Amazon Home Page
    When Search for product
      | Laptop      |
      | Mobile       |
      | Fridge       |
      | Microwave    |
      | Water Heater |
    And Open the Prefered Product
    Then Click Add to cart button
