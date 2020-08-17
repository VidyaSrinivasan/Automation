package stepDefinition;

import Cucumber.Automation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
	

	
	@Before("@RegTest")
	
	public void beforeRegValidation()
	{
		System.out.println("Before Reg hooks");
		
	}
	
	@After("@RegTest")
	
	public void afterRegValidation()
	{
		System.out.println("After Reg hooks");
		
	}
	
@Before("@SmokeTest")
	
	public void beforeSmokeValidation()
	{
		System.out.println("Before Smoke hooks");
		
	}
	
	@After("@SmokeTest")
	
	public void afterSmokeValidation()
	{
		System.out.println("After Smoke hooks");
		
	}
	
@After("@SeleniumTest")

public void browserClose()
{
	driver.close();
}
	
}
