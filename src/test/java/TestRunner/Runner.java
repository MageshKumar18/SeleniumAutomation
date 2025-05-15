package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\mages\\eclipse-workspace\\CucumberPractice\\src\\test\\resources\\features",
		glue = "StepDefinitions",
		plugin = {"pretty","html:test-output/MyReport.html"},
		monochrome = true,
		dryRun = false
		
)

public class Runner {

}
