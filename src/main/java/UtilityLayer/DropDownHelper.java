package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class DropDownHelper extends BaseClass {

	// If drop down starts without select tags
	public static void selectValue(List<WebElement> lists, String expectedValue) {
		for (WebElement wb : WaitHelper.visibilityOfAllElements(lists)) {

			if (wb.getText().equalsIgnoreCase(expectedValue)) {
				WaitHelper.elementToBeClickable(wb).click();
				break;
			}
		}
	}

	// If drop down starts with select tags

	public static void selectByVisibleText(WebElement wb, String expectedValue) {
		new Select(WaitHelper.visibilityOf(wb)).selectByVisibleText(expectedValue);
	}

	public static void selectByValue(WebElement wb, String value) {
		new Select(WaitHelper.visibilityOf(wb)).selectByValue(value);
	}

	public static void selectByIndex(WebElement wb, int index) {
		new Select(WaitHelper.visibilityOf(wb)).selectByIndex(index);
	}

	public static void selectValue(WebElement wb, String expectedValue) {
		List<WebElement> lists = new Select(WaitHelper.visibilityOf(wb)).getOptions();

		for (WebElement dpwb : WaitHelper.visibilityOfAllElements(lists)) {
			String actualValue = WebElementHelper.getText(dpwb);

			if (actualValue.equalsIgnoreCase(expectedValue)) {
				WebElementHelper.click(dpwb);
				break;
			}
		}
	}
}
