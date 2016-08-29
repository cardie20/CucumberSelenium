#Author: rebeca.perez.lainez@gmail.com
Feature: Button modify search is shown in the page

Scenario: As a user I want to see a "Modify search" button in the hotels result page after searching Hotel
Given A user makes hotels search in madrid
When the user lands in hotels result page	
Then is shown a Modify Search button in the hotels result page
