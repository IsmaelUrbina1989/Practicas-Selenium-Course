package commonMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class WrapClass {
	
	public static void click (WebElement webUI) {
		webUI.click();
	}

	public static void sendKeys (WebElement webUI, String textToSend) {
		webUI.sendKeys(textToSend);
	}

	public static String getText (WebElement webUI) {
		return webUI.getText();
	}

	public static boolean verifyElementDispleyed (WebElement webUI) {
		return webUI.isDisplayed();
	}

	public static void takeScreenshot (WebDriver webDriver, String testCaseName) {
		File scrFile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
		String screenshotPath = "./test-output/ExecutionResults";
		
		try {
			FileHandler.createDir(new File (screenshotPath));
			FileHandler.copy(scrFile, new File(screenshotPath + File.separatorChar + testCaseName + ".png"));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
