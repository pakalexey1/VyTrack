
@Test3
Feature: Refresh button is clickable and refreshes the page
  User Story: As a user when I am on Vytrack => Fleet => Vehicles, I should be able to see Export Grid
  dropdown, Refresh, Reset and Grid Settings Buttons
  Accounts are: Truck Drivers, Store Manager, Sales Manager
#User should be able to click on the Refresh button
  @1TruckDriver
  Scenario Outline: Truck driver clicked on the Refresh button and it refreshed the page
    Given user "<truck_driver.username>" "<password>" is on the vehicle page
    When user clicks on the Refresh button
    Then user see page is refreshed
    Examples:
      |truck_driver.username|password|
      |truck_driver.username1|password|
      |truck_driver.username2|password|
      |truck_driver.username3|password|
  @2StoreManager
  Scenario Outline: Store Manager clicked on the "Refresh" button and it refreshed the page
    Given user "<store_manager.username>" "<password>" is on the vehicle page
    When user clicks on the Refresh button
    Then user see page is refreshed
    Examples:
      |store_manager.username|password|
      |store_manager.username1|password|
      |store_manager.username2|password|
      |store_manager.username3|password|
  @3SalesManager
  Scenario Outline: Sales Manager clicked on the "Refresh" button and it refreshed the page
    Given user "<sales_manager.username>" "<password>" is on the vehicle page
    When user clicks on the Refresh button
    Then user see page is refreshed
    Examples:
      |sales_manager.username|password|
      |sales_manager.username1|password|
      |sales_manager.username2|password|
      |sales_manager.username3|password|
  @4CloseDriver
  Scenario: Close the chrome browser
    And close Chrome browser page
