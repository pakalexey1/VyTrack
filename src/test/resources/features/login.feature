@Login @smoke
Feature: VyTrack app login feature

User Story: As a user. I should be able to login with correct credentials to different accounts
and dashboard should be displayed.

Accounts are: truck_driver, store_manager, sales_manager

  @TruckDriver
  Scenario Outline: As a TruckDriver I should be able to login with correct credentials

    Given user is on the VyTrack login page
    When user enters "<truck_driver_username>" and "<password>"
    Then user should see dashboard
    Examples:
      | truck_driver_username  | password |
      | truck_driver_username1 | password |
      | truck_driver_username2 | password |
      | truck_driver_username3 | password |

  @StoreManager
  Scenario Outline: As a StoreManager I should be able to login with correct credentials

    Given user is on the VyTrack login page
    When user enters "<store_manager_username>" and "<password>"
    Then user should see dashboard
    Examples:
      | store_manager_username  | password |
      | store_manager_username1 | password |
      | store_manager_username2 | password |
      | store_manager_username3 | password |

  @SalesManager @practice
  Scenario Outline: As a SalesManager I should be able to login with correct credentials

    Given user is on the VyTrack login page
    When user enters "<sales_manager_username>" and "<password>"
    Then user should see dashboard
    Examples:
      | sales_manager_username  | password |
      | sales_manager_username1 | password |
      | sales_manager_username2 | password |
      | sales_manager_username3 | password |

@practice
  Scenario: Menu Options for salesmanager
    Given user is on the VyTrack login page
    When user enters the sales manager information
    Then user should be able to see following modules
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |



