package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.WrapClass;

public class CheckOutPage {

	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//WebElements CheckOutPage	
	@FindBy(id = "checkout") 
	private WebElement checkuotBtn;

	//Methods CheckOutPage
	public void checkOut () {
		WrapClass.click(checkuotBtn);		
	}

}