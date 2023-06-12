Feature: Logout
    Background:
      Given The user is on the login page
      When The user should be able to login with valid {string} and {string}
      Then The user close the popup