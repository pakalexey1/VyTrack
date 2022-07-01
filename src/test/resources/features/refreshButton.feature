@RefreshClick
Feature: Click Refresh button
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