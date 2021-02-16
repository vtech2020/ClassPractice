@Desktop
Feature: Desktop Retail Website Feature


Background: 
			Given User is on Retail website
			When User click on Desktops tab
			And User click on Show all desktops


@ItemsPresentDesktop
Scenario: User verify all items are present in Desktops tab
						
			Then User should see all items are present in Desktop page
			
@addHPLP3065FromDesktopTabToCart
Scenario: User add HP LP3065  from Desktops tab to the cart

          And User click ADD TO CARToption on HP LP3065 item 
          And User select quantity '1'
          And User click add to Cart button
          Then User should see a message Success: You have added HP LP3065 to your shopping cart!

			
			
			
			
		