
Feature: Refresh button is to the left side of Reset button
  User story: As a user when I am on VyTrack => Fleet => Vehicles, I should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons
  Accounts are: Truck Drivers, Store Manager, Sales Manager

  Scenario: Truck_Driver_first can see Refresh button to the left side of Reset button
    Given Truck_Driver_one is on the vehicle page
    When user moves to Refresh button
    Then user can see Refresh button to the left side of Reset button

  Scenario: Truck_Driver_second can see Refresh button to the left side of Reset button
    Given Truck_Driver_two is on the vehicle page
    When user moves to Refresh button
    Then user can see Refresh button to the left side of Reset button

  Scenario: Truck_Driver_three can see Refresh button to the left side of Reset button
    Given Truck_Driver_three is on the vehicle page
    When user moves to Refresh button
    Then user can see Refresh button to the left side of Reset button
  @Sasha
  Scenario: Store_Manager_one can see Refresh button to the left side of Reset button
    Given Store_Manager_one is on the vehicle page
    When user moves to Refresh button
    Then user can see Refresh button to the left side of Reset button
  @Sasha
  Scenario: Store_Manager_two can see Refresh button to the left side of Reset button
    Given Store_Manager_two is on the vehicle page
    When user moves to Refresh button
    Then user can see Refresh button to the left side of Reset button
  @Sasha
  Scenario: Store_Manager_three can see Refresh button to the left side of Reset button
    Given Store_Manager_three is on the vehicle page
    When user moves to Refresh button
    Then user can see Refresh button to the left side of Reset button
  @Sasha
  Scenario: Sales_Manager_one can see Refresh button to the left side of Reset button
    Given Sales_Manager_one is on the vehicle page
    When user moves to Refresh button
    Then user can see Refresh button to the left side of Reset button
  @Sasha
  Scenario: Sales_Manager_two can see Refresh button to the left side of Reset button
    Given Sales_Manager_two is on the vehicle page
    When user moves to Refresh button
    Then user can see Refresh button to the left side of Reset button
  @Sasha
  Scenario: Sales_Manager_three can see Refresh button to the left side of Reset button
    Given Sales_Manager_three is on the vehicle page
    When user moves to Refresh button
    Then user can see Refresh button to the left side of Reset button

