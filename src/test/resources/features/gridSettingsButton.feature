@GridSettingClick
Feature: click Grid Setting Button
  User Story: As a user when I am on VyTrack => Fleet => Vehicles, I should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons
  Accounts are: Truck Drivers, Store Manager, Sales Manager

  @TruckDriver_GridBtn_first
  Scenario: TruckDriver_GridBtn_first can click Grid Settings button
    Given TruckDriver_GridBtn_first is on the vehicle page
    And user can see Grid Settings button and click


  @TruckDriver_GridBtn_second
  Scenario: TruckDriver_GridBtn_second can click Grid Settings button
    Given TruckDriver_GridBtn_second is on the vehicle page
    And user can see Grid Settings button and click


  @TruckDriver_GridBtn_third
  Scenario: TruckDriver_GridBtn_third can click Grid Settings button
    Given TruckDriver_GridBtn_third is on the vehicle page
    And user can see Grid Settings button and click


  @StoreManager_GridBtn_first
  Scenario: StoreManager_GridBtn_first can click Grid Settings button
    Given StoreManager_GridBtn_first is on the vehicle page
    And user can see Grid Settings button and click


  @StoreManager_GridBtn_second
  Scenario: StoreManager_GridBtn_second can click Grid Settings button
    Given StoreManager_GridBtn_second is on the vehicle page
    And user can see Grid Settings button and click


  @StoreManager_GridBtn_third
  Scenario: StoreManager_GridBtn_third can click Grid Settings button
    Given StoreManager_GridBtn_third is on the vehicle page
    And user can see Grid Settings button and click


  @SalesManager_GridBtn_first
  Scenario: SalesManager_GridBtn_first can click Grid Settings button
    Given SalesManager_GridBtn_first is on the vehicle page
    And user can see Grid Settings button and click


  @SalesManager_GridBtn_second
  Scenario: SalesManager_GridBtn_second can click Grid Settings button
    Given SalesManager_GridBtn_second is on the vehicle page
    And user can see Grid Settings button and click


  @SalesManager_GridBtn_third
  Scenario: SalesManager_GridBtn_third can click Grid Settings button
    Given SalesManager_GridBtn_third is on the vehicle page
    And user can see Grid Settings button and click

  @AlexeyGridSettingsBtn
  Scenario Outline: Grid Settings should be on the right side of the Reset button
    Given user "<truck_driver_username>" enters "<password>" on the vehicle page
    Then user is able to see Grid Settings on the right side of the Reset button
    Examples:
      | truck_driver_username  | password |
      | truck_driver_username1 | password |
      | truck_driver_username2 | password |
      | truck_driver_username3 | password |

  @AlexeyGridSettingsBtn
  Scenario Outline: Grid Settings should be on the right side of the Reset button
    Given user "<sales_manager_username>" enters "<password>" on the vehicle page
    Then user is able to see Grid Settings on the right side of the Reset button
    Examples:
      | sales_manager_username  | password |
      | sales_manager_username1 | password |
      | sales_manager_username2 | password |
      | sales_manager_username3 | password |

  @AlexeyGridSettingsBtn
  Scenario Outline: Grid Settings should be on the right side of the Reset button
    Given user "<store_manager_username>" enters "<password>" on the vehicle page
    Then user is able to see Grid Settings on the right side of the Reset button
    Examples:
      | store_manager_username  | password |
      | store_manager_username1 | password |
      | store_manager_username2 | password |
      | store_manager_username3 | password |
