@Test
Feature: Click Export Grid dropdown
  User Story: User Story: As a user when I am on Vytrack => Fleet => Vehicles, I should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons
  Accounts are: Truck Drivers, Store Manager, Sales Manager

  @TruckDriver_first
  Scenario: Truck_Driver_first can click on Export Grid dropdown
    Given Track_Driver_first is on the vehicle page
    When user clicks on Export Grid dropdown button
    Then user should see two options: CSV and XLSX

  @TruckDriver_second
  Scenario: Truck_Driver_second can click on Export Grid dropdown
    Given Track_Driver_second is on the vehicle page
    When user clicks on Export Grid dropdown button
    Then user should see two options: CSV and XLSX

  @TruckDriver_third
  Scenario: Truck_Driver_third can click on Export Grid dropdown
    Given Track_Driver_third is on the vehicle page
    When user clicks on Export Grid dropdown button
    Then user should see two options: CSV and XLSX

  @StoreManager_first
  Scenario: Store_Manager_first can click on Export Grid dropdown
    Given Store_Manager_first is on the vehicle page
    When user clicks on Export Grid dropdown button
    Then user should see two options: CSV and XLSX

  @StoreManager_second
  Scenario: Store_Manager_second can click on Export Grid dropdown
    Given Store_Manager_second is on the vehicle page
    When user clicks on Export Grid dropdown button
    Then user should see two options: CSV and XLSX

  @StoreManager_third
  Scenario: Store_Manager_third can click on Export Grid dropdown
    Given Store_Manager_third is on the vehicle page
    When user clicks on Export Grid dropdown button
    Then user should see two options: CSV and XLSX

  @SalesManager_first
  Scenario: Sales_Manager_first can click on Export Grid dropdown
    Given Sales_Manager_first is on the vehicle page
    When user clicks on Export Grid dropdown button
    Then user should see two options: CSV and XLSX

  @SalesManager_second
  Scenario: Sales_Manager_second can click on Export Grid dropdown
    Given Sales_Manager_second is on the vehicle page
    When user clicks on Export Grid dropdown button
    Then user should see two options: CSV and XLSX

  @SalesManager_third
  Scenario: Sales_Manager_third can click on Export Grid dropdown
    Given Sales_Manager_third is on the vehicle page
    When user clicks on Export Grid dropdown button
    Then user should see two options: CSV and XLSX
