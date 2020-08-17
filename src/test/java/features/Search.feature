Feature: Search and place order

@SeleniumTest
Scenario: Search for items and validate results
Given user is on Greencart landing page
When user tries to search for "Cucumber" vegetable
Then "Cucumber" results are displayed

@SeleniumTest
Scenario: Search for items and move to checkout page
Given user is on Greencart landing page
When user tries to search for "Brinjal" vegetable
And added items to cart
And user proceeds to checkout page
Then verify selected "Brinjal" items are displayed in checkout page


