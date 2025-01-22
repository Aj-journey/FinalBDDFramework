package UtilityLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class WebElementHelper extends BaseClass {

	public static void sendKeys(WebElement wb, String value) {
		WaitHelper.visibilityOf(wb).sendKeys(value);
	}

	public static void click(WebElement wb) {
		WaitHelper.elementToBeClickable(wb).click();
	}

	public static boolean isDisplayed(WebElement wb) {
		return WaitHelper.visibilityOf(wb).isDisplayed();
	}

	public static String getText(WebElement wb) {
		return WaitHelper.visibilityOf(wb).getText();
	}

	public static String getAttribute(WebElement Wb, String keyname) {
		return WaitHelper.visibilityOf(Wb).getAttribute(keyname);
	}

}
