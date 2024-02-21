package loginTestCases;

import org.testng.annotations.Test;

import commonMethods.GlobalVariables;
import commonMethods.WrapClass;
import navigationPages.LoginPage;
import setupDriver.SetupDriver;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC01_Login {

	//Declarar_Inicializar_WebDriver
	WebDriver driver = SetupDriver.setupDriver();

	//PageObjects
	LoginPage loginPage = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}

	@Test
	public void TC01() {
		loginPage.login(GlobalVariables.STANDARD_USER, GlobalVariables.PASSWORD);
	}

	@AfterTest
	public void closeDriver() {
		WrapClass.takeScreenshot(driver, "TC01_Login");
		driver.quit();
	}

}
