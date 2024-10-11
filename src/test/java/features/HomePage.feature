@HomePage
Feature: Home Page

  Background:
    Given I am on home page

  Scenario Outline: Verify correct redirect behavior for tabs with dropdown options
    When I click home page tab with dropdown options "<tab>"
    Then I am redirected to "<url>"

    Examples:
      | tab       | url                                   |
      | about     | https://ict-strypes.eu/about-strypes/ |
      | services  | https://ict-strypes.eu/services/      |
      | resources | https://ict-strypes.eu/resources/     |

  Scenario Outline: Verify correct redirect behavior for tabs with no dropdown options
    When I click home page tab with no dropdown options "<tab>"
    Then I am redirected to "<url>"

    Examples:
      | tab         | url                                 |
      | customers   | https://ict-strypes.eu/customers/   |
      | nearsurance | https://ict-strypes.eu/nearsurance/ |
      | careers     | https://ict-strypes.eu/careers/     |
