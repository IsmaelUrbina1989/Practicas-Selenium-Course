package inventoryTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import commonMethods.GlobalVariables;
import commonMethods.WrapClass;
import navigationPages.AddToCartPage;
import navigationPages.CheckOutPage;
import navigationPages.CompletePage;
import navigationPages.InformationPage;
import navigationPages.LoginPage;
import navigationPages.OverviewPage;
import setupDriver.SetupDriver;

public class TC02_AddToCart {

	//Declarar_Inicializar_WebDriver
	WebDriver driver = SetupDriver.setupDriver();

	//PageObjects
	LoginPage loginPage = new LoginPage(driver);
	AddToCartPage addToCartPage = new AddToCartPage(driver);
	CheckOutPage checkOutPage = new CheckOutPage(driver);
	InformationPage informationPage = new InformationPage(driver);
	OverviewPage overviewPage = new OverviewPage(driver);
	CompletePage completePage = new CompletePage(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}

	@Test
	public void TC02() {
		//STEP 1
		loginPage.login(GlobalVariables.STANDARD_USER, GlobalVariables.PASSWORD);
		
		//STEP 2
		boolean isDisplayed = addToCartPage.verifyRemoveButton();
		Assert.assertTrue(isDisplayed);
		
		//STEP  3
		addToCartPage.addToCart();
		
		//STEP 4
		checkOutPage.checkOut();
		
		//STEP 5
		informationPage.informationData(GlobalVariables.FIRSTNAME, GlobalVariables.LASTNAME, GlobalVariables.ZIPCODE);
		
		//STEP 6
		overviewPage.overview();
		
		//STEP 7
		boolean textValidacion = completePage.verifyOrderText();
		Assert.assertTrue(textValidacion);
	}

	@AfterTest
	public void closeDriver() {
		WrapClass.takeScreenshot(driver, "TC02_AddToCart");
		driver.quit();
	}
}