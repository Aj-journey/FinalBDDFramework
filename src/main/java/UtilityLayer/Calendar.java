package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class Calendar extends BaseClass {

	public static void selectMonthAndYear(WebElement monthYear, String expectedMonthYear, WebElement next) {
		while (true) {
			String actualMonthYear = WebElementHelper.getText(monthYear);

			if (actualMonthYear.equalsIgnoreCase(expectedMonthYear)) {
				break;
			} else {
				WebElementHelper.click(next);
			}
		}
	}

	public static void selectDate(List<WebElement> listDate, String expectedDate) {
		for (WebElement wb : WaitHelper.visibilityOfAllElements(listDate)) {
			String actualDate = WebElementHelper.getText(wb);

			if (actualDate.equalsIgnoreCase(expectedDate)) {
				WebElementHelper.click(wb);
				break;
			}
		}
	}

}
