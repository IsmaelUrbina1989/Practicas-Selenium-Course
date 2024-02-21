package inventoryTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import commonMethods.GlobalVariables;
import commonMethods.WrapClass;
import navigationPages.InventoryPage;
import navigationPages.LoginPage;
import setupDriver.SetupDriver;

public class TC02_AddToCart {

	//Declarar_Inicializar_WebDriver
	WebDriver driver = SetupDriver.setupDriver();

	//PageObjects
	LoginPage loginPage = new LoginPage(driver);
	InventoryPage inventoryPage = new InventoryPage(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}

	@Test
	public void TC02() {
		loginPage.login(GlobalVariables.STANDARD_USER, GlobalVariables.PASSWORD);
		inventoryPage.addToCart(GlobalVariables.FIRSTNAME, GlobalVariables.LASTNAME, GlobalVariables.ZIPCODE);
		boolean textValidacion = inventoryPage.verifyOrderText();
		Assert.assertTrue(textValidacion);
	}

	@AfterTest
	public void closeDriver() {
		WrapClass.takeScreenshot(driver, "TC02_AddToCart");
		driver.quit();
	}
}
