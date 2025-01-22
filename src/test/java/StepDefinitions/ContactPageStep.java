package StepDefinitions;

import java.util.List;
import java.util.Map;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import PageLayer.HomePage;
import UtilityLayer.ExcelReader;
import io.cucumber.java.en.When;

public class ContactPageStep extends BaseClass {
	ContactPage contactPage;

	@When("user click on contact link")
	public void user_click_on_contact_link() {
		new HomePage().clickOnContactLink();
	}

	@When("user click on create button")
	public void user_click_on_create_button() {
		contactPage = new ContactPage();
		contactPage.clickOnCreateButton();
	}

	@When("user create new contact by reading test data from Excel Sheet {string} and {int}")
	public void user_create_new_contact_by_reading_test_data_from_excel_sheet_and(String sheetName, Integer rowNumber)
			throws Exception {

		String ExcelPath = System.getProperty("user.dir") + "//src//main//java//TestData//Cogmento Test Data.xlsx";

		ExcelReader excel = new ExcelReader(ExcelPath, sheetName);

		String firstName = excel.readExcelTestData().get(rowNumber).get("FirstName").toString();
		String lastName = excel.readExcelTestData().get(rowNumber).get("LastName").toString();
		String email = excel.readExcelTestData().get(rowNumber).get("Email").toString();
		String status = excel.readExcelTestData().get(rowNumber).get("Status").toString();
		String desc = excel.readExcelTestData().get(rowNumber).get("Descriptions").toString();

		contactPage.createNewContact(firstName, lastName, email, status, desc);

		Thread.sleep(4000);
	}

	@When("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {
		contactPage.clickOnSaveButton();

		Thread.sleep(4000);
	}
}
