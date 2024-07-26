Feature: Checkout Process

  Scenario: User adds a notebook to the cart and proceeds to checkout
    Given the user is on the home page
    When the user navigates to the Computers section
    And the user selects the Notebooks category
    And the user adds a notebook to the cart
    And the user clicks on the cart icon
    And the user agrees to the terms and conditions
    And the user proceeds to checkout
    Then the user should be on the Billing page
