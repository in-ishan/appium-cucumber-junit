#Author: ishan.s@outlook.com
#Creation date: December 30, 2016
#Summary: This feature file depicts the 'Batch Uninstall' feature of the 'All In One Toolbox' app with concrete scenarios describing feature behavior.

@batch_uninstall
Feature: Batch Uninstall
 User should able to uninstall multiple apps in one go
 User should able to search an app by name
 By default apps in batch uninstall page should be sorted by name
 User should able to sort apps by size or install time in batch uninstall page
 Header of batch uninstall page should show number of apps currently installed and total space occupied by those
  
  @regression
  Scenario: Batch uninstall
    Given user is on batch uninstall page
    When user select below apps
    | App Name          |
    | PumpCurves        |
    | Selenium Tutorial |
    And click on uninstall selected button
    And accept all confirmations
    Then user get uninstall finished message
   
  @sanity 
  Scenario: Batch uninstall number of apps selected count
    Given user is on batch uninstall page
    When user select below apps
    | App Name           |
    | Google Hindi Input | 
    | mab                |
    Then number of apps selected count is displayed on the uninstall selected button
 
