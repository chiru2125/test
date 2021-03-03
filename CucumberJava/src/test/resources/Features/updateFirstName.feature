@updatename
Feature: feature to test update firstname in myaccount

  Scenario: Check My account and update First Name
    Given user navigate to myaccount page
    When Update Firstname
    Then save the details
