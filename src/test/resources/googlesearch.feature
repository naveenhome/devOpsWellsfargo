Feature: Google Search
Scenario: Name search to see result count
Given I have entered "Naveen Kumar Singh" in google
And Google is open in FireFox browser
And URL for google is "https://www.google.co.in"
When I click on google "Search" button
Then it should display all matching result