package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.WebElementHelper;

public class LoginPage extends BaseClass {

	@FindBy(name = "email")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//div[text()='Login']")
	private WebElement loginButton;

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void enterUsernameAndPassword(String Username, String Password) {
		WebElementHelper.sendKeys(username, Username);
		WebElementHelper.sendKeys(password, Password);
	}

	public void clickOnLoginButton() {
		WebElementHelper.click(loginButton);
	}
}
