Feature: Credit Card Successfull Payment

@Testcase1
Scenario: Verifying with valid card details
Given open browser and launch url
When I clicked on Buy now
Then I clicked on checkout button on Shopping Cart
And I clicked on Continue button on Ordar Summary Page
And On Payment Page select payment type as Credit Card
Then enter valid card number
And enter valid expiry date
And enter valid cvv
Then click on Pay now button
Then enter valid password 
And click ok
Then verify successfull message
And close browser

@Testcase2
Scenario: Verifying with invalid card details
Given open browser and launch url
When I clicked on Buy now
Then I clicked on checkout button on Shopping Cart
And I clicked on Continue button on Ordar Summary Page
And On Payment Page select payment type as Credit Card
Then enter card number for negative scenario
And enter invalid expiry date
And enter valid cvv
Then click on Pay now button
And close browser
