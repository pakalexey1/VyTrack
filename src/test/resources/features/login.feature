@Login
Feature: VyTrack app login feature

User Story: As a user. I should be able to login with correct credentials to different accounts
and dashboard should be displayed.

Accounts are: truck_driver, store_manager, sales_manager

  @TruckDriver
  Scenario Outline: As a TruckDriver I should be able to login with correct credentials

    Given user is on the VyTrack login page
    When user enters "<truck_driver.username>" and "<password>"
    Then user should see dashboard
    Examples:
      | truck_driver.username  | password |
      | truck_driver.username1 | password |
      | truck_driver.username2 | password |
      | truck_driver.username3 | password |

  @StoreManager
  Scenario Outline: As a StoreManager I should be able to login with correct credentials

    Given user is on the VyTrack login page
    When user enters "<store_manager.username>" and "<password>"
    Then user should see dashboard
    Examples:
      | store_manager.username  | password |
      | store_manager.username1 | password |
      | store_manager.username2 | password |
      | store_manager.username3 | password |

  @SalesManager
  Scenario Outline: As a SalesManager I should be able to login with correct credentials

    Given user is on the VyTrack login page
    When user enters "<sales_manager.username>" and "<password>"
    Then user should see dashboard
    Examples:
      | sales_manager.username  | password |
      | sales_manager.username1 | password |
      | sales_manager.username2 | password |
      | sales_manager.username3 | password |





