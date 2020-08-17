package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	
	public WebDriver driver;
	
	By cartIcon = By.xpath("//a[4]//img[1]");
	By checkOut = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	public CartPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement openCart()
	{
		return driver.findElement(cartIcon);
	}
	
	public WebElement proceedCheckout()
	{
		return driver.findElement(checkOut);
	}
	

}
