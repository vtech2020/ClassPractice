package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DesktopPageObj;
import utilities.WebDriverUtility;

public class DesktopTestStepDefinitions extends Base {
	
	DesktopPageObj desktopPage = new DesktopPageObj();
	
	@Then("^User should see all items are present in Desktop page$")
				public void all_items_are_present_in_Desktop_page() throws Throwable {
		
						Assert.assertTrue(desktopPage.appleCinema30LinkTextIsDisplayed());
						logger.info("appleCinema30 is checked");
						WebDriverUtility.screenShot();
						
						Assert.assertTrue(desktopPage.CanonEOS5DTextLinkIsDisplayed());
						logger.info("CanonEOS5DT is checked");
						
						Assert.assertTrue(desktopPage.HPLP3065TextLinkIsDisplayed());
						logger.info("HPLP3065 is checked");
						
						Assert.assertTrue(desktopPage.HTCTouchHDTextLinkIsDisplayed());
						logger.info("HTCTouchHD is checked");
						
						Assert.assertTrue(desktopPage.iPhoneTextLinkIsDisplayed());
						logger.info("iPhoneTextLink is checked");
									
						Assert.assertTrue(desktopPage.iPodClassicTextLinkIsDisplayed());
						logger.info("iPodClassic is checked");
						
						Assert.assertTrue(desktopPage.MacBookAirTextLinkIsDisplayed());
						logger.info("MacBookAir is checked");
						
						Assert.assertTrue(desktopPage.PalmTreoProTextLinkIsDisplayed());
						logger.info("PalmTreoPro is checked");
						
						Assert.assertTrue(desktopPage.Product8TextLinkIsDisplayed());
						logger.info("Product8 is checked");
						
						Assert.assertTrue(desktopPage.samsungSyncMaster941BwTextLinkIsDisplayed());
						logger.info("samsungSyncMaster941Bw is checked");
						
						Assert.assertTrue(desktopPage.SonyVAIOTextLinkIsDisplayed());
						logger.info("SonyVAIO is checked");
						
						WebDriverUtility.screenShot();
					
						
												
				}
	
		
	@And("^User click ADD TO CARToption on HP LP3065 item$")
			public void user_click_ADD_TO_CARToption_on_HP_LP_item() throws Throwable {
	    			desktopPage.clickOnAddToCartHPLP3065();
	    			logger.info("User clicked on Add to cart option on HP LP3065");    
	}
	
	

	@And("^User select quantity '(.+)'$")
			public void user_select_quantity(String quantity) throws Throwable {
					desktopPage.EnterQantityHPLP3065(quantity);
					logger.info("User selected quantity: " + quantity);
					WebDriverUtility.screenShot();
					
	}

	@And("^User click add to Cart button$")
			public void user_click_add_to_Cart_button() throws Throwable {
	    			desktopPage.clickOnAddToCart_For_HPLP3065_Page_Btn();
	    			logger.info("User clicked on Add To Cart on HP LP3065 page");
	    			WebDriverUtility.screenShot();
	}
	

	@Then("^User should see a message Success: You have added HP LP3065 to your shopping cart!$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart() throws Throwable {
			Assert.assertTrue(desktopPage.addToCart_For_HPLP3065_outcome());
			WebDriverUtility.screenShot();
			logger.info("Success message for HP LP3065 added to cart is displayed");
			
			/*String message=desktopPage.addToCart_For_HPLP3065_outcomeText();
			logger.info("Success message is:" + message);
			Assert.assertEquals("Success: You have added HP LP3065 to your shopping cart!", message);
			logger.info("Success message for HP LP3065 is correct");*/
			
			//Success: you have added HP LP3065 to your Shopping cart!
			
			
			
			
			
	}
	
	}
