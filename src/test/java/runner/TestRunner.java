package runner;
//import io.cucumber.junit.CucumberOptions;/// this creates a problem
import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		//reporting purpose
		monochrome=false,  //console output color
		dryRun = false,
		//tags = "@1CreateData", //tags from feature file
		features = {"src/test/resources/features/4AssignmentPositiveScenarios.feature",
				"src/test/resources/features/5AssignmentNegativeScenarios.feature"},
		glue= "stepDefinitions",
		plugin = {"pretty", "html:target/testResult1.html"}//"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
		//tags = "@1CreateDataN"
		) //location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests{
	
}