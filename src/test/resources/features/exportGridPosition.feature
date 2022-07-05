@Ganjina
Feature:  Export Grid dropdown is on the left side of the page
  User Story: User Story: As a user when I am on Vytrack => Fleet => Vehicles, I should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons
  Accounts are: Truck Drivers, Store Manager, Sales Manager


  Scenario: Truck Driver One can see the Export Grid dropdown on the left side of All Cars page
    Given truck_driver_one is on the All cars page
    When user moves to Export Grid Dropdown button
    Then user sees the Export Grid Dropdown button on the left side of the page

  Scenario: Truck Driver Two can see the Export Grid dropdown on the left side of All Cars page
    Given truck_driver_two is on the All cars page
    When user moves to Export Grid Dropdown button
    Then user sees the Export Grid Dropdown button on the left side of the page

  Scenario: Truck Driver Three can see the Export Grid dropdown on the left side of All Cars page
    Given truck_driver_three is on the All cars page
    When user moves to Export Grid Dropdown button
    Then user sees the Export Grid Dropdown button on the left side of the page

  Scenario: Store manager One can see the Export Grid dropdown on the left side of All Cars page
    Given store_manager_one is on the All cars page
    When user moves to Export Grid Dropdown button
    Then user sees the Export Grid Dropdown button on the left side of the page

  Scenario: Store manager Two can see the Export Grid dropdown on the left side of All Cars page
    Given store_manager_two is on the All cars page
    When user moves to Export Grid Dropdown button
    Then user sees the Export Grid Dropdown button on the left side of the page

  Scenario: Store manager Three can see the Export Grid dropdown on the left side of All Cars page
    Given store_manager_three is on the All cars page
    When user moves to Export Grid Dropdown button
    Then user sees the Export Grid Dropdown button on the left side of the page

  Scenario: Sales manager One can see the Export Grid dropdown on the left side of All Cars page
    Given sales_manager_one is on the All cars page
    When user moves to Export Grid Dropdown button
    Then user sees the Export Grid Dropdown button on the left side of the page

  Scenario: Sales manager Two can see the Export Grid dropdown on the left side of All Cars page
    Given sales_manager_two is on the All cars page
    When user moves to Export Grid Dropdown button
    Then user sees the Export Grid Dropdown button on the left side of the page

  Scenario: Sales manager Three can see the Export Grid dropdown on the left side of All Cars page
    Given sales_manager_three is on the All cars page
    When user moves to Export Grid Dropdown button
    Then user sees the Export Grid Dropdown button on the left side of the page





