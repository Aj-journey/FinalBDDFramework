package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsHelper extends BaseClass {

	// Handle Radio button
	public static void selectValue(List<WebElement> lists, String expectedValue) {
		
		for (WebElement wb : WaitHelper.visibilityOfAllElements(lists)) 
		{
			if (wb.getText().equalsIgnoreCase(expectedValue)) {
				WaitHelper.elementToBeClickable(wb).click();
				break;
			}
		}
	}

}
