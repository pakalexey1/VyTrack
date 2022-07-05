@Ganjina
Feature:  Export Grid dropdown is on the left side of the page
  User Story: User Story: As a user when I am on Vytrack => Fleet => Vehicles, I should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons
  Accounts are: Truck Drivers, Store Manager, Sales Manager


  Scenario Outline: Truck Driver can see the Export Grid dropdown on the left side of All Cars page
    Given user "<truck_driver_username>" "<password>" is on the All cars page
    When user moves to Export Grid Dropdown button
    Then user sees the Export Grid Dropdown button on the left side of the page
    Examples:
      | truck_driver_username  | password |
      | truck_driver_username1 | password |
      | truck_driver_username2 | password |
      | truck_driver_username3 | password |


  Scenario Outline: Store manager can see the Export Grid dropdown on the left side of All Cars page
    Given user "<store_manager_username>" "<password>" is on the All cars page
    When user moves to Export Grid Dropdown button
    Then user sees the Export Grid Dropdown button on the left side of the page
    Examples:
      | store_manager_username  | password |
      | store_manager_username1 | password |
      | store_manager_username2 | password |
      | store_manager_username3 | password |


  Scenario Outline: Sales manager can see the Export Grid dropdown on the left side of All Cars page
    Given user "<sales_manager_username>" "<password>" is on the All cars page
    When user moves to Export Grid Dropdown button
    Then user sees the Export Grid Dropdown button on the left side of the page
    Examples:
      | sales_manager_username  | password |
      | sales_manager_username1 | password |
      | sales_manager_username2 | password |
      | sales_manager_username3 | password |








