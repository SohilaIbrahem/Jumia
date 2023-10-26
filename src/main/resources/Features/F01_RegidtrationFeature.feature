@Scenario
  Feature: Check login Feature

    @SmokeTest
    Scenario: Create a new account on Jumia
      Given User Open Jumia website
      When User click on the Account Then Sign in
      And User fill in the registration data and Submit
      Then User should have a new account on Jumia

