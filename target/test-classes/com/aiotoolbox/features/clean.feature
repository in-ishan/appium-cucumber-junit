#Author: ishan.s@outlook.com
#Created on: January 12, 2017
#Summary: This feature file describes the 'Clean' feature of 'All-In-One Toolbox' app.

@clean
Feature: Clean
  User should able to improve system performance by using 'Clean' feature.
  
  @regression @ss
  Scenario: Clean feature should clear unused app data from RAM
    Given user is on clean page
    When user clicked on clean button
    Then user should get message system performance is improved