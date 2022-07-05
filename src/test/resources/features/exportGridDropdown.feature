@Test
Feature: Click Export Grid dropdown
 User Story: As a user when I am on Vytrack => Fleet => Vehicles, I should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons
 Accounts are: Truck Drivers, Store Manager, Sales Manager
  @1TruckDriver
  Scenario Outline: Truck driver can click on Export Grid dropdown

    Given user "<truck_driver.username>" "<password>" is on the vehicle page
    When user clicks on Export Grid dropdown button
    Then user should see two options: CSV and XLSX
    Examples:
      |truck_driver.username|password|
      |truck_driver.username1|password|
      |truck_driver.username2|password|
      |truck_driver.username3|password|
  @2StoreManager
  Scenario Outline: Store Manager can click on Export Grid dropdown

    Given user "<store_manager.username>" "<password>" is on the vehicle page
    When user clicks on Export Grid dropdown button
    Then user should see two options: CSV and XLSX
    Examples:
      |store_manager.username|password|
      |store_manager.username1|password|
      |store_manager.username2|password|
      |store_manager.username3|password|
  @3SalesManager
  Scenario Outline: Sales Manager can click on Export Grid dropdown

    Given user "<sales_manager.username>" "<password>" is on the vehicle page
    When user clicks on Export Grid dropdown button
    Then user should see two options: CSV and XLSX
    Examples:
      |sales_manager.username|password|
      |sales_manager.username1|password|
      |sales_manager.username2|password|
      |sales_manager.username3|password|
@4CloseDriver
Scenario: Close the chrome browser
    And close Chrome browser page