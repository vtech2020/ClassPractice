package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class RetailPageObj extends Base {
	// Once we created Page obj we need to extend the Base class to use Parent class
	// properties such is WebDriver driver
	//  we create a constructor and inside constructor we define PageFactory.initElements
	// method to initialize the WebElements in this page
	
	public RetailPageObj() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	// we need to store UI WebElements in a private weElement using @FindBy annotations of
	//PageFactory class
	
	
	
	
	
	@FindBy(xpath="//a[contains(text(), 'Desktops') and @class='dropdown-toggle']")
	private WebElement desktopsTab;
	
	@FindBy(xpath="//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktopsButton;
	
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchBar;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;
	
	@FindBy(xpath="//img[@title='iPhone']")
	private WebElement iphoneImage;
	
	
	
	
	
	
	/// Register page
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;
	
 
	@FindBy(xpath = "(//a[text()='Register'])[1]")
	private WebElement registerOption;
	
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement firstNameField;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement lastNameField;
	
	@FindBy(css="#input-email")
	private WebElement emailField;
	
	@FindBy(id="input-telephone")
	private WebElement telephoneField;
	
	@FindBy(id="input-password")
	private WebElement passwordField;
	
	@FindBy(id="input-confirm")
	private WebElement confirmPasswordField;
	
	@FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]")
	private WebElement yesSubscribeBtn;
	
	@FindBy(xpath="//body/div[@id='account-register']/div[2]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[2]")
	private WebElement noSubscribeBtn;
	
	@FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement privacyPolicyCheckBox;
	
	@FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
	private WebElement continueBtn;
	
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	private WebElement accountCreatedMessage;
	
	
	
	//We need to create public methods to perform required actions on each element
	
	
	public void clickOnMyAccount() {
		WebDriverUtility.clickOnElement(myAccount);
	}
		
		
	public void EnterValueToSearchBar(String value) {
		WebDriverUtility.enterValue(searchBar, value);
		
	}
	
	public void clickOnSearchButton() {
		WebDriverUtility.clickOnElement(searchButton);
	}
	
	public boolean iPhoneImageIsDisplayed () {
		
		if(iphoneImage.isDisplayed())
			return true;
		else
			return false;
		
	}
	
	//we need to create Methods to perform on each WebElement
	
	public void clickOnRegister() {
		WebDriverUtility.clickOnElement(registerOption);
	}
	
	public void enterFirstName(String fName) {
		WebDriverUtility.enterValue(firstNameField, fName);
	}
	
	public void enterLastName(String lName) {
		WebDriverUtility.enterValue(lastNameField, lName);
	}
	
	public void enterEmail (String email) {
		WebDriverUtility.enterValue(emailField, email);
	}
	
	public void enterTelephone (String telephone) {
		WebDriverUtility.enterValue(telephoneField, telephone);
	}
	
	public void enterPassword (String password) {
		WebDriverUtility.enterValue(passwordField, password);
	}
	
	public void enterConfirmPassword(String confirmPassword) {
		WebDriverUtility.enterValue(confirmPasswordField, confirmPassword);
}
	
	public void subscribe(String valueOfSubscribe) {
		if(!yesSubscribeBtn.isSelected()) {
		WebDriverUtility.clickOnElement(yesSubscribeBtn);
		} else 
			WebDriverUtility.clickOnElement(noSubscribeBtn);
	}
	
	public void checkPrivacyPolicy() {
		if (privacyPolicyCheckBox.isDisplayed()) {
			privacyPolicyCheckBox.click();
		}
	}
	
	public void clickOnContinueButton() {
		WebDriverUtility.clickOnElement(continueBtn);
	}
	
	public boolean registrationOutcome() {
		boolean successMessage = accountCreatedMessage.isDisplayed();
		return successMessage;

	}
	
	public void clickOnDesktopsTab() {
		WebDriverUtility.clickOnElement(desktopsTab);
	}
	
	public void clickOnShowAllDesktops() {
		WebDriverUtility.clickOnElement(showAllDesktopsButton);
	}
}
