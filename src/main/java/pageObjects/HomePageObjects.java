package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class HomePageObjects extends Base {
	
public HomePageObjects() {
		
		/*PageFactory.initElements(driver, this);
		
	}
	
	// we need to store UI WebElements in a private weElement using @FindBy annotations of
	//PageFactory class
	
	@FindBy(xpath="//*[text()='Currency']")
	private WebElement curencyButton;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;
	
	@FindBy(xpath="//img[@title='iPhone']")
	private WebElement iphoneImage;
	
	//We need to create public methods to perform required actions on each element
	
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
	
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub */

	}

}
