package StepDefinitions;

import BaseLayer.BaseClass;
import UtilityLayer.TakeScreenshot;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {

	@AfterStep
	public void tearDown(Scenario scenario) {

		scenario.attach(TakeScreenshot.takescreenshot(), "image/png", scenario.getName());

	}

}
