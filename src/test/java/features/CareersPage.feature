@Careers
Feature: Careers page

  Background:
    Given I navigate to careers page "careers"

  Scenario Outline: Verify correct search results
    When I search for open position "<position>"
    Then the search result is correct "<position>" "<resultText>"
    Examples:
      | position           | resultText         |
      | Quality Assurance  | Quality Assurance  |
      | Python Development | Python Development |
      | Data Engineering   | Data Engineering   |
