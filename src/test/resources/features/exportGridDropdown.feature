@Test1
Feature: Click Export Grid dropdown
 User Story: As a user when I am on Vytrack => Fleet => Vehicles, I should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons
 Accounts are: Truck Drivers, Store Manager, Sales Manager
  @TruckDriver_1
  Scenario Outline: Truck driver can click on Export Grid dropdown
    Given user "<truck_driver_username>" "<password>" is on the vehicle page
    When user clicks on Export Grid dropdown button
    Then user should see two options: CSV and XLSX
    Examples:
      |truck_driver_username|password|
      |truck_driver_username1|password|
      |truck_driver_username2|password|
      |truck_driver_username3|password|

  @StoreManager_1
  Scenario Outline: Store Manager can click on Export Grid dropdown
    Given user "<store_manager_username>" "<password>" is on the vehicle page
    When user clicks on Export Grid dropdown button
    Then user should see two options: CSV and XLSX
    Examples:
      |store_manager_username|password|
      |store_manager_username1|password|
      |store_manager_username2|password|
      |store_manager_username3|password|

  @SalesManager_1
  Scenario Outline: Sales Manager can click on Export Grid dropdown
    Given user "<sales_manager_username>" "<password>" is on the vehicle page
    When user clicks on Export Grid dropdown button
    Then user should see two options: CSV and XLSX
    Examples:
      |sales_manager_username|password|
      |sales_manager_username1|password|
      |sales_manager_username2|password|
      |sales_manager_username3|password|
  #solution feature 1 with loop