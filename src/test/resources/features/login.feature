Feature: VyTrack app login feature

User Story: As a user. I should be able to login with correct credentials to different accounts
and dashboard should be displayed.

Accounts are: truck_driver, store_manager, sales_manager

  Scenario: Login as track_driver_1
    Given user is on the VyTrack login page
    When user enters track_driver_first username and password
    Then user should see dashboard

  Scenario: Login as track_driver_2
    Given user is on the VyTrack login page
    When user enters track_driver_second username and password
    Then user should see dashboard

  Scenario: Login as track_driver_3
    Given user is on the VyTrack login page
    When user enters track_driver_third username and password
    Then user should see dashboard

  Scenario: Login as store_manager_1
    Given user is on the VyTrack login page
    When user enters store_manager_first username and password
    Then user should see dashboard

  Scenario: Login as store_manager_2
    Given user is on the VyTrack login page
    When user enters store_manager_second username and password
    Then user should see dashboard

  Scenario: Login as store_manager_3
    Given user is on the VyTrack login page
    When user enters store_manager_third username and password
    Then user should see dashboard

  Scenario: Login as sales_manager_1
    Given user is on the VyTrack login page
    When user enters sales_manager_first username and password
    Then user should see dashboard

  Scenario: Login as sales_manager_2
    Given user is on the VyTrack login page
    When user enters sales_manager_second username and password
    Then user should see dashboard

  Scenario: Login as sales_manager_3
    Given user is on the VyTrack login page
    When user enters sales_manager_third username and password
    Then user should see dashboard





