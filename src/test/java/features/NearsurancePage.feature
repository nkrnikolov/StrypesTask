@Nearsurance
Feature: Nearsurance page

  Background:
    Given I navigate to nearsurance tab "nearsurance"

  Scenario: Verify user can open nearsurance whitepaper
    When I try to open nearsurance whitepaper
    Then new tab is opened with the nearsurance whitepaper
