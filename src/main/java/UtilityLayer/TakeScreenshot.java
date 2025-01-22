package UtilityLayer;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;

public class TakeScreenshot extends BaseClass {

	public static byte[] takescreenshot() {
		TakesScreenshot ts = (TakesScreenshot) getDriver();
		return ts.getScreenshotAs(OutputType.BYTES);
	}
}
