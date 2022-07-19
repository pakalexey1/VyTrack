@reset
Feature: Reset button
  User Story: As a user when I am on VyTrack => Fleet => Vehicles, I should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons
  Accounts are: Truck Drivers, Store Manager, Sales Manager

Scenario Outline: Truck Driver able to click "Reset" button
Given user  "<truck_driver_username>" "<password>" is on the vehicle page
When user click Reset button
And user go to setting and uncheck Licence plate
Then user click Reset button and verify that Licence plate is checked

Examples:
| truck_driver_username  | password |
| truck_driver_username1 | password |
| truck_driver_username2 | password |
| truck_driver_username3 | password |

Scenario Outline: Store manager able to click "Reset" button
Given user  "<store_manager_username>" "<password>" is on the vehicle page
  When user click Reset button
  And user go to setting and uncheck Licence plate
  Then user click Reset button and verify that Licence plate is checked
  Examples:
| store_manager_username  | password |
| store_manager_username1 | password |
| store_manager_username2 | password |
| store_manager_username3 | password |

Scenario Outline: Sales able to click "Reset" button
Given user  "<sales_manager_username>" "<password>" is on the vehicle page
  When user click Reset button
  And user go to setting and uncheck Licence plate
  Then user click Reset button and verify that Licence plate is checked
  Examples:
| sales_manager_username  | password |
| sales_manager_username1 | password |
| sales_manager_username2 | password |
| sales_manager_username3 | password |