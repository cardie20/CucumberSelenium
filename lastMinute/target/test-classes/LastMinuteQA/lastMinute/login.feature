@smokeTest 
Feature: Login Feature File
@selenium
Scenario: Login scenario test for Gmail

Given navigate to gmail page
When user logged in using username as “aa” and password as “aa”
Then home page should be displayed
