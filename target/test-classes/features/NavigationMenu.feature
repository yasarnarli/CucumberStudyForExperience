@Task
Feature: Krafttech Login Test With Different Users

  Scenario: Login as a Mike
    Given The user is on the login page
    When The user enters Mike credentials
    Then Get the text of Dashboard
    When Go to Developers menu
    Then Get the text of Developer

  Scenario: Login as a Sebastian
    Given The user is on the login page
    When The user enters Sebastian credentials
    Then Get the text of Dashboard
    When Go to Edit Profile menu
    Then Get the text of Edit User profile

    Scenario: Login as a Jhon Nash
        Given The user is on the login page
        When The user enters Jhon Nash credentials
        Then Get the text of Dashboard
        When Go to MyProfile menu
        Then Get the text of User profile

