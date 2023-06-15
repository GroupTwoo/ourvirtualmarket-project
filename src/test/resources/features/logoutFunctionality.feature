
Feature: Logout Test Set
    Background: logout directly
      Given The user is on the login page
      When The user should be able to login with valid "denemekraft@gmail.com" and "krafttech123"
  @logout
    Scenario:
      Given Click the Logout button at the top right corner
      When Verify that title is "Account Logout"
      And Verify that the logout helper texts
      And Verify that the Continue button is visible
      Then Go back to previous page
      And Verify that Login and Register button is visible and Logout button is not visible
      And Verify that title is not "My Account"

    Scenario: Logout directly - 2
      Given Click the Logout button at the down right of the page
      When Verify that title is "Account Logout"
      And Verify that the logout helper texts
      And Verify that the Continue button is visible
      Then Go back to previous page
      And Verify that Login and Register button is visible and Logout button is not visible
      And Verify that title is not "My Account"
    @logout1
    Scenario: Logout After add an Item to Cart
      Given The user go to the "Television" module
      And The user select the third product
      And The user clicks add to cart button
      And The user close the Added to cart successfully popup
      And Click the Logout button at the top right corner
      When Verify that title is "Account Logout"
      And Verify that the logout helper texts
      And Verify that the Continue button is visible
      When Go back to previous page
      When Hover the My Cart
      Then Verify that My cart is empty
      Then Verify that Login button is visible
