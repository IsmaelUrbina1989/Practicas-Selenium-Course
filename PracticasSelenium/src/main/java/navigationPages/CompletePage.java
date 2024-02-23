package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.WrapClass;

public class CompletePage {

	public CompletePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//WebElements CompletePage!	
	@FindBy(className = "complete-header") 
	private WebElement orderLbl;

	//Methods CompletePage!	
	public boolean verifyOrderText() {
		boolean orderTXT = WrapClass.getText(orderLbl).contains("Thank you for your order!");
		if (orderTXT) {
			System.out.println("La orden es correcta");
		}else {
			System.out.println("ERROR: La orden NO es correcta");
		}
		return orderTXT;
	}
}