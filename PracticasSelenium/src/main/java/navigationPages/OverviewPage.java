package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.WrapClass;

public class OverviewPage {

	public OverviewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//WebElements OverviewPage	
	@FindBy(id = "finish") 
	private WebElement finishBtn;

	//Methods OverviewPage
	public void overview () {		
		WrapClass.click(finishBtn);			
	}
}