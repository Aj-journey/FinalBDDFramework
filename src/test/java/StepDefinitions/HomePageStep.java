package StepDefinitions;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.When;

public class HomePageStep extends BaseClass {
	HomePage homePage;

	@When("user is on validate home page logo")
	public void user_is_on_validate_home_page_logo() {
		homePage = new HomePage();
		Assert.assertEquals(homePage.checkLogoStatus(), true);
	}

	@When("user validate home page title")
	public void user_validate_home_page_title() {

		Assert.assertEquals(homePage.getTitle(), "Cogmento CRM");
	}

	@When("user validate home page url")
	public void user_validate_home_page_url() {
		boolean actualValue = homePage.getCurrentUrl().contains("cogmento");

		Assert.assertEquals(actualValue, true);
	}
}
