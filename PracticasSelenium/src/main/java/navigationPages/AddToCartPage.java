package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.WrapClass;

public class AddToCartPage {

	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//WebElements AddToCartPage
	@FindBy(id = "add-to-cart-sauce-labs-backpack") 
	private WebElement addBtn;
	@FindBy(id = "remove-sauce-labs-backpack") 
	private WebElement removeBtn;
	@FindBy(id = "shopping_cart_container") 
	private WebElement cartLink;

	//Methods AddToCartPage
	public boolean verifyRemoveButton() {
		WrapClass.click(addBtn);
		return WrapClass.verifyElementDispleyed(removeBtn);
	}
	
	public void addToCart () {		
		WrapClass.click(cartLink);
	}
}