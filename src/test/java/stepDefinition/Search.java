package stepDefinition;

import org.junit.Assert;
import org.junit.runner.RunWith;
import Cucumber.Automation.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.OrderPage;

@RunWith(Cucumber.class)
public class Search extends Base{
	
	
	
	HomePage h;
	OrderPage o;
	CartPage c;
	
	
	@Given("^user is on Greencart landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
		driver = Base.getDriver();
    }

    @When("^user tries to search for \"([^\"]*)\" vegetable$")
    public void user_tries_to_search_for_something_vegetable(String strArg1) throws Throwable {
    Thread.sleep(2000);	
    h = new HomePage(driver);
    h.getSearch().sendKeys(strArg1);
    Thread.sleep(3000);
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    	HomePage h = new HomePage(driver);
    	Assert.assertTrue(h.getProductName().getText().contains(strArg1));
    	
    }
    
    @Then("^verify selected \"([^\"]*)\" items are displayed in checkout page$")
    public void verify_selected_something_items_are_displayed_in_checkout_page(String strArg1) throws Throwable {
    	o = new OrderPage(driver);
    	Assert.assertTrue(o.checkProduct().getText().contains(strArg1));
    	
    	
    }

    @And("^added items to cart$")
    public void added_items_to_cart() throws Throwable {
    	HomePage h = new HomePage(driver);	
    h.incrementProduct().click();
    h.addToCart().click();
        
    }

    @And("^user proceeds to checkout page$")
    public void user_proceeds_to_checkout_page() throws Throwable {
    	c = new CartPage(driver);
    	c.openCart().click();
    	c.proceedCheckout().click();
    	Thread.sleep(2000);
        
    }
}
