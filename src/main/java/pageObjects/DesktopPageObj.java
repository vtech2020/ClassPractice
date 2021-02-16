package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopPageObj extends Base {
	
		public DesktopPageObj() {
		
				PageFactory.initElements(driver, this);	
				
			
}

		
		//example each element of product block is described (picture, text link, description, price, tax)
		
		
		@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/a[1]/img[1]")
		private WebElement appleCinema30Picture;
		
		@FindBy(xpath="//a[contains(text(),'Apple Cinema 30')]")
		private WebElement appleCinema30LinkText;
		
		@FindBy(xpath="//p[contains(text(),'The 30-inch Apple Cinema HD Display delivers an am')]")
		private WebElement appleCinema30DescriptionText;
		
		@FindBy(xpath="//span[@class='price-new' and @xpath='1']")
		private WebElement appleCinema30PriceNew;
		
		@FindBy(xpath="//span[@class='price-old' and @xpath='1']")
		private WebElement appleCinema30PriceOld;
		
		@FindBy(xpath="//span[@class='price-tax' and @xpath='1']")
		private WebElement appleCinema30PriceTax;
		
		
		// other elements located by TextLink	
		
				
		@FindBy(xpath="//a[contains(text(),'Canon EOS 5D')]")
		private WebElement CanonEOS5DTextLink;
		
		@FindBy(xpath="//a[contains(text(),'HP LP3065')]")
		private WebElement HPLP3065TextLink;
		
		@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]")
		private WebElement HPLP3065AddToCartBtn;
				
		
		@FindBy(xpath="//a[contains(text(),'HTC Touch HD')]")
		private WebElement HTCTouchHDTextLink;
		
		@FindBy(xpath="//a[contains(text(),'iPhone')]")
		private WebElement iPhoneTextLink;
		
		@FindBy(xpath="//a[contains(text(),'MacBook')]")
		private WebElement iPodClassicTextLink;
		
		@FindBy(xpath="//a[contains(text(),'MacBook Air')]")
		private WebElement MacBookAirTextLink;
		
		@FindBy(xpath="//a[contains(text(),'Palm Treo Pro')]")
		private WebElement PalmTreoProTextLink;
		
		@FindBy(xpath=" //a[contains(text(),'Product 8')]")
		private WebElement Product8TextLink;
		
		@FindBy(xpath="//a[contains(text(),'Samsung SyncMaster 941BW')]")
		private WebElement samsungSyncMaster941BwTextLink;
		
		@FindBy(xpath="//a[contains(text(),'Sony VAIO')]")
		private WebElement SonyVAIOTextLink;
		
		
		//elements for the page of HP LP3065
		
		@FindBy(id="input-quantity")
		private WebElement QtyHPLP3065Field;
		
		@FindBy(id="button-cart")
		private WebElement AddToCart_For_HPLP3065_Page_Btn;
		
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
		private WebElement addToCart_For_HPLP3065_successMessageAlert;
		
			
		
		
		//methods to check if the product is present on the page
		
		public boolean appleCinema30LinkTextIsDisplayed() {
			
			if(appleCinema30LinkText.isDisplayed()) 
				return true;
			else 
				return false;	
		}
		
		
		
		public boolean CanonEOS5DTextLinkIsDisplayed() {
			
			if(CanonEOS5DTextLink.isDisplayed()) 
				return true;
			else 
				return false;	
		}
		
		public boolean HPLP3065TextLinkIsDisplayed() {
			
			if(HPLP3065TextLink.isDisplayed()) 
				return true;
			else 
				return false;	
		}
		
				
		public boolean HTCTouchHDTextLinkIsDisplayed() {
			
			if(HTCTouchHDTextLink.isDisplayed()) 
				return true;
			else 
				return false;	
		}
		
		
		public boolean iPhoneTextLinkIsDisplayed() {
			
			if(HPLP3065TextLink.isDisplayed()) 
				return true;
			else 
				return false;	
		}
		
		

		public boolean iPodClassicTextLinkIsDisplayed() {
	
			if(iPodClassicTextLink.isDisplayed()) 
				return true;
			else 
				return false;	
		}
		

		public boolean MacBookAirTextLinkIsDisplayed() {
	
			if(MacBookAirTextLink.isDisplayed()) 
				return true;
			else 
				return false;	
		}

		public boolean PalmTreoProTextLinkIsDisplayed() {
	
			if(PalmTreoProTextLink.isDisplayed()) 
				return true;
			else 
				return false;	
	}
		

		public boolean Product8TextLinkIsDisplayed() {
	
			if(Product8TextLink.isDisplayed()) 
				return true;
			else 
				return false;	
		}
		
		

		public boolean samsungSyncMaster941BwTextLinkIsDisplayed() {
	
			if(samsungSyncMaster941BwTextLink.isDisplayed()) 
				return true;
			else 
				return false;	
		}
		

		public boolean SonyVAIOTextLinkIsDisplayed() {
	
			if(SonyVAIOTextLink.isDisplayed()) 
				return true;
			else 
		return false;	
		}
		
		
				
		public void clickOnAddToCartHPLP3065() {
			WebDriverUtility.clickOnElement(HPLP3065AddToCartBtn);
		}

		
		public void EnterQantityHPLP3065(String quantity) {
			if ( QtyHPLP3065Field.isEnabled()) {
			WebDriverUtility.clearText(QtyHPLP3065Field);
			WebDriverUtility.enterValue(QtyHPLP3065Field, quantity);
			} else System.out.println("Quantity field for HPLP3065 is not displayed");

		}
		
		
		public void clickOnAddToCart_For_HPLP3065_Page_Btn() {
			WebDriverUtility.clickOnElement(AddToCart_For_HPLP3065_Page_Btn);
		}
		
		
		public boolean addToCart_For_HPLP3065_outcome() {
				boolean successMessage = addToCart_For_HPLP3065_successMessageAlert.isDisplayed();
				return successMessage;

			}
		
		public String addToCart_For_HPLP3065_outcomeText() {
			    String text = addToCart_For_HPLP3065_successMessageAlert.getText();
			    return text;
		}
			
		}

		
		
		





