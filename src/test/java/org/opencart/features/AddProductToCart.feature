@AddProductToCart
Feature: Verify the User is able to add a product to the cart

  Scenario Outline: Verify the User is able to add Mac desktop to the cart
    Given User is on Home Page
    And User navigates to Login Page
    When User enters "<Username>" and "<Password>"
    Then User should land in My Account Page
    When User navigates to Mac Desktop Page
    Then User should see a Mac Desktop
    When User clicks on Add to Cart button
    Then User should see a confirmation message that product has been added to the cart
    Examples:
      | Username                | Password    |
      | satheesh.it47@gmail.com | Tester@2024 |


  Scenario Outline: Verify the User is able to add iPhone to the cart
    Given User is on Home Page
    And User navigates to Login Page
    When User enters "<Username>" and "<Password>"
    Then User should land in My Account Page
    When User clicks on Phones option in Menu
    Then User should see iPhones in the results
    When User select iPhone and add it to cart
    Then User should see a confirmation message that product has been added to the cart
    Examples:
      | Username                | Password    |
      | satheesh.it47@gmail.com | Tester@2024 |


  Scenario Outline: Verify the User is able to add Samsung Galaxy tab to the cart
    Given User is on Home Page
    And User navigates to Login Page
    When User enters "<Username>" and "<Password>"
    Then User should land in My Account Page
    When User clicks on Tablets option in Menu
    Then User should see Samsung Galaxy tab in the results
    When User select Samsung Galaxy tab and add it to cart
    Then User should see a confirmation message that product has been added to the cart
    Examples:
      | Username                | Password    |
      | satheesh.it47@gmail.com | Tester@2024 |


  Scenario Outline: Verify the User is not able to add Canon Camera to the cart
    Given User is on Home Page
    And User navigates to Login Page
    When User enters "<Username>" and "<Password>"
    Then User should land in My Account Page
    When User clicks on Cameras option in Menu
    Then User should see Cameras in the results
    When User select Canon camera
    Then User should see no options available for Canon camera
    Then User should see a error message when try to add it to the cart
    Examples:
      | Username                | Password    |
      | satheesh.it47@gmail.com | Tester@2024 |

  Scenario Outline: Verify the User is able to add Nikon Camera to the cart
    Given User is on Home Page
    And User navigates to Login Page
    When User enters "<Username>" and "<Password>"
    Then User should land in My Account Page
    When User clicks on Cameras option in Menu
    Then User should see Cameras in the results
    When User select Nikon camera and add it to cart
    Then User should see a confirmation message that product has been added to the cart
    Examples:
      | Username                | Password    |
      | satheesh.it47@gmail.com | Tester@2024 |



