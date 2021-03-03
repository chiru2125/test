@order
Feature: feature to test order T-shirt

  Scenario: User login the application and order to T-shirt
    Given user open the url and login application
    When User select T shirt and confirmed
    And order submited sucessfully
    Then validate the order
