@Test
Feature: Click Export Grid dropdown
  User Story: User Story: As a user when I am on Vytrack => Fleet => Vehicles, I should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons
  Accounts are: Truck Drivers, Store Manager, Sales Manager

  @TruckDriver
  Scenario: Truck driver can click on Export Grid dropdown
    Given user is on the vehicle page
    When user clicks on Export Grid dropdown button
    Then user should see two options: CSV and XLSX

  @StoreManager
  Scenario: Store Manager can click on Export Grid dropdown
    Given user is on the vehicle page
    When user clicks on Export Grid dropdown button
    Then user should see two options: CSV and XLSX

  @SalesManager
  Scenario: Sales Manager can click on Export Grid dropdown
    Given user is on the vehicle page
    When user clicks on Export Grid dropdown button
    Then user should see two options: CSV and XLSX
