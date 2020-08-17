Feature: Account information

Background:

Given validate browser
When browser is triggered
Then check if browser is started

@SmokeTest
Scenario: Home page default login
Given user is on Netbanking login page
When User tries to login into application with "vidya" and "test"
Then Home page is displayed
And Cards are displayed is "true"

