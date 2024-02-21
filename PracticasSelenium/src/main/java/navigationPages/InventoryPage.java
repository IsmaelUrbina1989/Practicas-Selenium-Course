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

	//WebElements Add to Cart
	@FindBy(id = "add-to-cart-sauce-labs-backpack") private WebElement addBtn;
	@FindBy(id = "shopping_cart_container") private WebElement cartLink;
	@FindBy(id = "checkout") private WebElement checkuotBtn;
	@FindBy(id = "first-name") private WebElement firstNameTxt;
	@FindBy(id = "last-name") private WebElement lastNameTxt;
	@FindBy(id = "postal-code") private WebElement postalCodeTxt;
	@FindBy(id = "continue") private WebElement comtinueBtn;
	@FindBy(id = "finish") private WebElement finishBtn;
	@FindBy(className = "complete-header") private WebElement orderTxt;


	//Methods AddToCart
	public void addToCart (String firstname, String lastname, String postalcode ) {
		WrapClass.click(addBtn);
		WrapClass.click(cartLink);
		WrapClass.click(checkuotBtn);
		WrapClass.sendKeys(firstNameTxt, firstname);
		WrapClass.sendKeys(lastNameTxt, lastname);
		WrapClass.sendKeys(postalCodeTxt, postalcode);
		WrapClass.click(comtinueBtn);
		WrapClass.click(finishBtn);			
	}
	
	public boolean verifyOrderText() {
		boolean orderTXT = WrapClass.getText(orderTxt).contains("Thank you for your order!");
		if (orderTXT) {
			System.out.println("La orden es correcta");
		}else {
			System.out.println("ERROR: La orden NO es correcta");
		}
		return orderTXT;
	}
}
