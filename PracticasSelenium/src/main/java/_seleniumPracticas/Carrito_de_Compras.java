package _seleniumPracticas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Carrito_de_Compras {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();		
		Thread.sleep(2000);
		
		//OBTENER OBJETOS/WEBELEMENTS DE LA PAGINA WEB
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		
		//HACER LOGIN
		userName.sendKeys("standard_user");
		Thread.sleep(2000);
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		loginBtn.click();
		Thread.sleep(2000);
		
		WebElement addCartBackpack = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		WebElement cartBtn = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
		
		//AGREGAR BACKPACK AL CARRITO
		addCartBackpack.click();
		Thread.sleep(2000);
		
		//CLICK EN CARRITO DE COMPRAS 
		cartBtn.click();
		Thread.sleep(2000);
		
		WebElement checkOut = driver.findElement(By.xpath("//button[@id='checkout']"));
		
		//CLICK CHECKOUT
		checkOut.click();
		Thread.sleep(2000);
		
		WebElement fisrtName = driver.findElement(By.name("firstName"));
		WebElement lastName = driver.findElement(By.name("lastName"));
		WebElement zipCode = driver.findElement(By.name("postalCode"));
		WebElement continueBtn = driver.findElement(By.name("continue"));
		
		//LLENAR FORMULARIO
		fisrtName.sendKeys("Ismael");
		lastName.sendKeys("Urbina");
		zipCode.sendKeys("07300");
		Thread.sleep(2000);
		
		//CLICK CONTINUE
		continueBtn.click();
		Thread.sleep(2000);
		
		WebElement finishBtn = driver.findElement(By.id("finish"));
		
		//CLICK FINISH
		finishBtn.click();
		Thread.sleep(2000);
		
		//VALIDACION DE TEXTO "Thank you for your order!"
		String orderTxt = driver.findElement(By.className("complete-header")).getText();
		
		boolean textValidacion = orderTxt.contains("Thank you for your order!");
		
		if (textValidacion) {
			System.out.println("La Orden es correcta");
		}else {
			System.out.println("ERROR: La Orden NO es correcta");
		}		
		Thread.sleep(3000);
		
		driver.close();
	}

}
