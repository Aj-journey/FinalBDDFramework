package UtilityLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class JsHelper extends BaseClass {

	public static void click(WebElement wb) {
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].click()", WaitHelper.visibilityOf(wb));

	}

	public static void sendKeys(WebElement wb, String value) {
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].value='" + value + "';",
				WaitHelper.visibilityOf(wb));
	}

	public static void scrollUpToElement(WebElement wb) {
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				WaitHelper.visibilityOf(wb));

	}

	public static void borderElement(WebElement wb) {
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.border='3px solid red';",
				WaitHelper.visibilityOf(wb));

	}

}
