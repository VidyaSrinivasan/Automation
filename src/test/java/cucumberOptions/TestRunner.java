package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		stepNotifications = true,
		features = "src/test/java/features", 
		glue="stepDefinition",
		tags = "@SeleniumTest",
		dryRun = false,
		monochrome = true,
		plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cukes.xml"}
		)
public class TestRunner {
}
