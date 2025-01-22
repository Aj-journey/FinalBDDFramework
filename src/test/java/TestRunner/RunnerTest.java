package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			features= {"src/test/java/FeatureFiles/cogmento.feature"},
			extraGlue= {"StepDefinitions"},
			dryRun=false,
			monochrome=true,
			tags="@RegressionTest",
			plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
			
		)
public class RunnerTest extends AbstractTestNGCucumberTests{

	
	
}
