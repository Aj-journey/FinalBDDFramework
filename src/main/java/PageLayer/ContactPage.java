package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.DropDownHelper;
import UtilityLayer.WebElementHelper;

public class ContactPage extends BaseClass {

	@FindBy(xpath = "//a[@href='/contacts/new']")
	private WebElement createbutton;

	@FindBy(name = "first_name")
	private WebElement firstName;

	@FindBy(name = "last_name")
	private WebElement lastName;

	@FindBy(name = "value")
	private WebElement email;

	@FindBy(name = "status")
	private WebElement status;

	@FindBys(@FindBy(xpath = "//div[@name='status']/child::span"))
	private List<WebElement> statusLis;

	@FindBy(name = "description")
	private WebElement description;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;

	public ContactPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void clickOnCreateButton() {
		WebElementHelper.click(createbutton);
	}

	public void createNewContact(String FirstName, String LastName) {
		WebElementHelper.sendKeys(firstName, FirstName);
		WebElementHelper.sendKeys(lastName, LastName);

	}

	public void createNewContact(String FirstName, String LastName, String Email) {
		WebElementHelper.sendKeys(firstName, FirstName);
		WebElementHelper.sendKeys(lastName, LastName);
		WebElementHelper.sendKeys(email, Email);
	}

	public void createNewContact(String FirstName, String LastName, String Email, String Status) {
		WebElementHelper.sendKeys(firstName, FirstName);
		WebElementHelper.sendKeys(lastName, LastName);
		WebElementHelper.sendKeys(email, Email);
		WebElementHelper.click(status);
		DropDownHelper.selectValue(statusLis, Status);
	}

	public void createNewContact(String FirstName, String LastName, String Email, String Status, String desc) {
		WebElementHelper.sendKeys(firstName, FirstName);
		WebElementHelper.sendKeys(lastName, LastName);
		WebElementHelper.sendKeys(email, Email);
		WebElementHelper.click(status);
		DropDownHelper.selectValue(statusLis, Status);
		WebElementHelper.sendKeys(description, desc);

	}

	public void clickOnSaveButton() {
		WebElementHelper.click(saveButton);
	}

}
