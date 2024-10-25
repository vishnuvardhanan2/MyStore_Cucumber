
Feature: Cucumber framework in MyStore app
  

 
  Scenario: Successfully entering Index page
    Given User launch chrome browser
    
    When User opens URL "http://www.automationpractice.pl/index.php"
   
    Then Page Logo should be shown
    And Page title is equal to "My Shop"
    And Close browser

Scenario: Successfully entering Home page
    Given User launch chrome browser
    And User opens URL "http://www.automationpractice.pl/index.php"
    And User is in Index page
    When User clicks the signin Button in Index page
   
    Then User is navigated to "http://www.automationpractice.pl/index.php?controller=authentication&back=my-account"
   And close the browser