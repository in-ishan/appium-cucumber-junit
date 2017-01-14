#Author: ishan.s@outlook.com
#Created on: January 13, 2017
#Summary: This feature file describes the 'Boost' feature of 'All-In-One Toolbox' app.

@boost
Feature: Boost
  User should able to improve system performance by using boost feature.
  
  @regression @ss
  Scenario: Boost feature should clear unused app data from RAM
    Given user is on boost page
    When user clicked on boost button
    Then user should get message system performance is boost