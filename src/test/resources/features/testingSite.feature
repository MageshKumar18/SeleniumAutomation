Feature: Testin
gSite Functionality

Scenario: Successful Login
Given User is on login page "http://www.automationpractice.pl/index.php"
When The user clicks on the sign in
And User enters his email id "john.cena@gmail.com"
And User enters his password "JohncenaWWE123"
And User clicks the sign in button
Then User has successfully logged in and validated the page title as "MY ACCOUNT"

Scenario: Add a dress to the cart from Womens section
Given User is already logged in
When User navigates to the Womens section
And User selects the product blouse and adds it to cart
And User selects the product printed dress and adds it to cart
And User selects the product printed chiffon dress and adds it to cart
Then User sees the confirmation message "Product successfully added to your shopping cart"

