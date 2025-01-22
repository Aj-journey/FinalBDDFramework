package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.WebElementHelper;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//div[@class='header item']")
	private WebElement logo;

	@FindBy(xpath = "//a[@href='/contacts']")
	private WebElement contactLink;

	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	public boolean checkLogoStatus() {
		return WebElementHelper.isDisplayed(logo);
	}

	public void clickOnContactLink() {
		WebElementHelper.click(contactLink);
	}

	public String getTitle() {
		return getDriver().getTitle();
	}

	public String getCurrentUrl() {
		return getDriver().getCurrentUrl();
	}

}
