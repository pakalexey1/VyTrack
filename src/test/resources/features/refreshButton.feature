@RefreshClick
Feature: Refresh button
  User Story: As a user when I am on VyTrack => Fleet => Vehicles, I should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons
  Accounts are: Truck Drivers, Store Manager, Sales Manager

  @TruckDriver_first
  Scenario: Truck_Driver_first can click on Refresh button
    Given Truck_Driver_first is on the vehicle page
    When user clicks on All Cars dropdown button
    And user clicks on Refresh button
    Then All Cars dropdown option disappears

  @TruckDriver_second
  Scenario: Truck_Driver_second can click on Refresh button
    Given Truck_Driver_second is on the vehicle page
    When user clicks on All Cars dropdown button
    And user clicks on Refresh button
    Then All Cars dropdown option disappears

  @TruckDriver_first
  Scenario: Truck_Driver_third can click on Refresh button
    Given Truck_Driver_third is on the vehicle page
    When user clicks on All Cars dropdown button
    And user clicks on Refresh button
    Then All Cars dropdown option disappears

  @StoreManager_first
  Scenario: StoreManager_first can click on Refresh button
    Given Store_Manager_first is on the vehicle page
    When user clicks on All Cars dropdown button
    And user clicks on Refresh button
    Then All Cars dropdown option disappears

  @StoreManager_second
  Scenario: StoreManager_second can click on Refresh button
    Given StoreManager_second is on the vehicle page
    When user clicks on All Cars dropdown button
    And user clicks on Refresh button
    Then All Cars dropdown option disappears

  @StoreManager_third
  Scenario: StoreManager_third can click on Refresh button
    Given StoreManager_third is on the vehicle page
    When user clicks on All Cars dropdown button
    And user clicks on Refresh button
    Then All Cars dropdown option disappears

  @SalesManager_first
  Scenario: SalesManager_first can click on Refresh button
    Given Sales_Manager_first is on the vehicle page
    When user clicks on All Cars dropdown button
    And user clicks on Refresh button
    Then All Cars dropdown option disappears

  @SalesManager_second
  Scenario: SalesManager_second can click on Refresh button
    Given SalesManager_second is on the vehicle page
    When user clicks on All Cars dropdown button
    And user clicks on Refresh button
    Then All Cars dropdown option disappears

  @SalesManager_third
  Scenario: SalesManager_third can click on Refresh button
    Given SalesManager_third is on the vehicle page
    When user clicks on All Cars dropdown button
    And user clicks on Refresh button
    Then All Cars dropdown option disappears

  @Sasha
#  Feature: Refresh button is to the left side of Reset button
  Scenario Outline: Truck Driver can see Refresh button to the left side of Reset button
    Given "<truck_driver_username>" "<password>"  is on the vehicle page
    When user moves to Refresh button
    Then user can see Refresh button to the left side of Reset button
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


  @Test3 @Hanna
  Feature: Refresh button is clickable and refreshes the page
  User Story: As a user when I am on Vytrack => Fleet => Vehicles, I should be able to see Export Grid
  dropdown, Refresh, Reset and Grid Settings Buttons
  Accounts are: Truck Drivers, Store Manager, Sales Manager
#User should be able to click on the Refresh button
  @TruckDriver_3 @B26G15-127 @B26G15-130 @Hanna
  Scenario Outline: Truck driver clicked on the Refresh button and it refreshed the page
    Given user "<truck_driver_username>" "<password>" is on the vehicle page
    When user clicks on the Refresh button
    Then user see page is refreshed
    Examples:
      | truck_driver_username  | password |
      | truck_driver_username1 | password |
      | truck_driver_username2 | password |
      | truck_driver_username3 | password |

  @StoreManager_3 @B26G15-128 @B26G15-130 @Hanna
  Scenario Outline: Store Manager clicked on the "Refresh" button and it refreshed the page
    Given user "<store_manager_username>" "<password>" is on the vehicle page
    When user clicks on the Refresh button
    Then user see page is refreshed
    Examples:
      | store_manager_username  | password |
      | store_manager_username1 | password |
      | store_manager_username2 | password |
      | store_manager_username3 | password |

  @3SalesManager_3 @B26G15-129 @B26G15-130  @Hanna
  Scenario Outline: Sales Manager clicked on the "Refresh" button and it refreshed the page
    Given user "<sales_manager_username>" "<password>" is on the vehicle page
    When user clicks on the Refresh button
    Then user see page is refreshed
    Examples:
      | sales_manager_username  | password |
      | sales_manager_username1 | password |
      | sales_manager_username2 | password |
      | sales_manager_username3 | password |
#solution feature 3 with loop