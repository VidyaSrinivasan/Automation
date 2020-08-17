Feature: Application Login

@RegTest
Scenario: Home page default login
Given user is on Netbanking login page
When User tries to login into application with "vidya" and "test"
Then Home page is displayed
And Cards are displayed is "true"

@SmokeTest @RegTest
Scenario: Home page default login
Given user is on Netbanking login page
When User tries to login into application with "lakshmi" and "test"
Then Home page is displayed
And Cards are displayed is "false"

Scenario: Home page default login
Given user is on Netbanking login page
When User signs up with following details
| jenny | abcd| john@abcd.com | 23345|
Then Home page is displayed
And Cards are displayed is "false"

@RegTest
Scenario Outline: Home page default login
Given user is on Netbanking login page
When User tries to login in to application with <username> and <password>
Then Home page is displayed
And Cards are displayed is "true"

Examples:
|username|password|
|user1|pass1|
|user2|pass2|
|user3|pass3|