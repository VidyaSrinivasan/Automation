package stepDefinition;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {
	  @Given("^user is on Netbanking login page$")
	    public void user_is_on_netbanking_login_page() throws Throwable {
	        System.out.println("Login page is displayed");
	    }

	   @When("^User tries to login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	   public void user_tries_to_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
	    	System.out.println(strArg1);
	    	System.out.println(strArg2);
	    }

	    @Then("^Home page is displayed$")
	    public void home_page_is_displayed() throws Throwable {
	    	System.out.println("Home page is displayed");
	    	System.out.println("Home page2 is displayed");
	    	System.out.println("Home page3 is displayed");
	    	System.out.println("Home page4 is displayed");
	    	System.out.println("Home page5 is displayed");
	    }

	    @And("^Cards are displayed is \"([^\"]*)\"$")
	    public void cards_are_displayed_is_something(String strArg1) throws Throwable {
	        System.out.println(strArg1);
	    }

	    @When("^User signs up with following details$")
	    public void user_signs_up_with_following_details(DataTable data) throws Throwable {
	    	         List<List<String>> obj = data.asLists();
	    	         System.out.println(obj.get(0).get(0));
	    	         System.out.println(obj.get(0).get(1));
	    	         System.out.println(obj.get(0).get(2));
	    	         System.out.println(obj.get(0).get(3));
					
	       
	    }
	    
	    @When("^User tries to login in to application with (.+) and (.+)$")
	    public void user_tries_to_login_into_application_with_and(String username, String password) throws Throwable {
	        System.out.println(username);
	        System.out.println(password);
	    }
	    
	    @Given("^validate browser$")
	    public void validate_browser() throws Throwable {
	        System.out.println("Validate browser");
	        System.out.println("Validate browser2");
	    }

	    @When("^browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
	    	System.out.println("Browser is triggered");
	    	System.out.println("Browser2 is triggered");
	    }

	    @Then("^check if browser is started$")
	    public void check_if_browser_is_started() throws Throwable {
	    	System.out.println("Browser is started");
	    	System.out.println("Browser2 is started");
	    	//Test comments
	    	//Test comments 2
	    }


}