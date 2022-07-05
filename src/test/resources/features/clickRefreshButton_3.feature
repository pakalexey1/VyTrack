@Test3
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
      |truck_driver_username|password|
      |truck_driver_username1|password|
      |truck_driver_username2|password|
      |truck_driver_username3|password|

  @StoreManager_3 @B26G15-128 @B26G15-130 @Hanna
  Scenario Outline: Store Manager clicked on the "Refresh" button and it refreshed the page
    Given user "<store_manager_username>" "<password>" is on the vehicle page
    When user clicks on the Refresh button
    Then user see page is refreshed
    Examples:
      |store_manager_username|password|
      |store_manager_username1|password|
      |store_manager_username2|password|
      |store_manager_username3|password|

  @3SalesManager_3 @B26G15-129 @B26G15-130  @Hanna
  Scenario Outline: Sales Manager clicked on the "Refresh" button and it refreshed the page
    Given user "<sales_manager_username>" "<password>" is on the vehicle page
    When user clicks on the Refresh button
    Then user see page is refreshed
    Examples:
      |sales_manager_username|password|
      |sales_manager_username1|password|
      |sales_manager_username2|password|
      |sales_manager_username3|password|
#solution feature 3 with loop