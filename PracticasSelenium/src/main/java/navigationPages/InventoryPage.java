package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.WrapClass;

public class InventoryPage {
	
	public InventoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//WebElements LoginPage
	@FindBy(id = "add-to-cart-sauce-labs-backpack") private WebElement addBtn;
	@FindBy(id = "shopping_cart_container") private WebElement cartLink;
	@FindBy(id = "checkout") private WebElement checkuotBtn;
	@FindBy(id = "first-name") private WebElement firstNameTxt;
	@FindBy(id = "last-name") private WebElement lastNameTxt;
	@FindBy(id = "postal-code") private WebElement postalCodeTxt;
	@FindBy(id = "continue") private WebElement comtinueBtn;
	@FindBy(id = "finish") private WebElement finishBtn;
	@FindBy(className = "complete-header") private WebElement orderTxt;
	
	public boolean verifyOrderText( ) {
		WrapClass.getText(orderTxt);
		return WrapClass.verifyElementDispleyed(orderTxt);
	}
	
	
	


}
