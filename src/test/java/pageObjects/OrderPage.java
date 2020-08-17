package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {
	
public WebDriver driver;
	
	By productName = By.cssSelector("p.product-name");
	
	public OrderPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement checkProduct()
	{
		return driver.findElement(productName);
	}
	
	

}
