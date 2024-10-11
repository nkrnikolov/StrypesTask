@Contact
Feature: Contact page

  Background:
    Given I navigate to contact tab "contact"

  Scenario: Verify error messages for mandatory fields are displayed
    When I try to submit empty form
    Then mandatory fields error messages are displayed
