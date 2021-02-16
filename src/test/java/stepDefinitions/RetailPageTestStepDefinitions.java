package stepDefinitions;


import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RetailPageObj;
import utilities.WebDriverUtility;

public class RetailPageTestStepDefinitions extends Base {
	
	// In this class we will write Actual Java/Selenium codes associated to each Scenario
	//Steps
	
	RetailPageObj retailPage = new RetailPageObj();
	
	
	@When("^User search for '(.+)'$")
	public void user_search_for_iphone(String value)  {
	    retailPage.EnterValueToSearchBar(value);
	    logger.info("User entered value in search bar");
	    WebDriverUtility.screenShot();
	}

	@When("^User click on search button$")
	public void user_click_on_search_button()  {
	   retailPage.clickOnSearchButton();
	   logger.info("User clicked on searched button");
	   
	}

	@Then("^User should see iphone image$")
	public void user_should_see_iphone_image()  {
	    Assert.assertTrue(retailPage.iPhoneImageIsDisplayed());
	    WebDriverUtility.screenShot();
	}
	
	
	@When("^User click on MyAccount$")
	public void user_click_on_MyAccount() throws Throwable {
		retailPage.clickOnMyAccount();;
	    
	}

		
	@When("^User click on Register option$")
	public void user_click_on_Register_option() throws Throwable {
	    retailPage.clickOnRegister();
	    logger.info("User clicked on Register Option");
	    
	}

	@When("^User fill the Registration form with below information$")
	public void user_fill_the_Registration_form_with_below_information(DataTable personalInfo) throws Throwable {
	     List<Map<String, String>> dataValues = personalInfo.asMaps(String.class, String.class);
	     retailPage.enterFirstName(dataValues.get(0).get("firstName"));
	     retailPage.enterLastName(dataValues.get(0).get("lastName"));
	     retailPage.enterEmail(dataValues.get(0).get("email"));
	     retailPage.enterTelephone(dataValues.get(0).get("telephone"));
	     retailPage.enterPassword(dataValues.get(0).get("password"));
	     retailPage.enterConfirmPassword(dataValues.get(0).get("confirmPassword"));
	     retailPage.subscribe(dataValues.get(0).get("subscribe"));
	     
	     logger.info("User  filled the information form");
	     WebDriverUtility.screenShot();
	}

	@When("^User accept the privacy and policy$")
	public void user_accept_the_privacy_and_policy() throws Throwable {
		retailPage.checkPrivacyPolicy();
		logger.info("User checked privacy policy");
		WebDriverUtility.screenShot();
	}

	@When("^User click on Continue button$")
	public void user_click_on_Continue_button() throws Throwable {
	    retailPage.clickOnContinueButton();
	    logger.info("User clicked on continue button");
	    WebDriverUtility.screenShot();
	}

	@Then("^User will be registered in Retail website$")
	public void user_will_be_registered_in_Retail_website() throws Throwable {
	    Assert.assertTrue(retailPage.registrationOutcome());
		WebDriverUtility.screenShot();
		logger.info("Account was created Successfully");
	}
	
	@When("^User click on Desktops tab$")
			public void user_click_on_Desktops_tab() {
					retailPage.clickOnDesktopsTab();
					logger.info("User clicked on desktops tab");
	}

	@And("^User click on Show all desktops$")
			public void user_click_on_show_all_desktops() {
					retailPage.clickOnShowAllDesktops();
					logger.info("User clicked on show all desctops option");
					WebDriverUtility.screenShot();
					
	}
	

	
	

	

}
