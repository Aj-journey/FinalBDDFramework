package StepDefinitions;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import UtilityLayer.PropertiesHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep extends BaseClass {
	LoginPage loginPage;

	@Given("user open url in {string} browser")
	public void user_open_url_in_browser(String browsername) {
		BaseClass.initlialization(browsername);
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		loginPage = new LoginPage();

		String username = PropertiesHelper.getProperty("SIT_WEB_USERNAME");
		String password = PropertiesHelper.getProperty("SIT_WEB_PASSWORD");

		loginPage.enterUsernameAndPassword(username, password);
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {

		loginPage.clickOnLoginButton();
	}
}
