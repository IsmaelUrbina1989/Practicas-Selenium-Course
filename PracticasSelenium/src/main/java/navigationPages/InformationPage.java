package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.WrapClass;

public class InformationPage {

	public InformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//WebElements InformationPage	
	@FindBy(id = "first-name") 
	private WebElement firstNameTxt;
	@FindBy(id = "last-name") 
	private WebElement lastNameTxt;
	@FindBy(id = "postal-code") 
	private WebElement postalCodeTxt;
	@FindBy(id = "continue") 
	private WebElement comtinueBtn;

	//Methods InformationPage
	public void informationData (String firstname, String lastname, String postalcode ) {		
		WrapClass.sendKeys(firstNameTxt, firstname);
		WrapClass.sendKeys(lastNameTxt, lastname);
		WrapClass.sendKeys(postalCodeTxt, postalcode);
		WrapClass.click(comtinueBtn);		
	}
}