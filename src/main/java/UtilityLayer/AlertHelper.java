package UtilityLayer;

import BaseLayer.BaseClass;

public class AlertHelper extends BaseClass {

	public static void accept() {
		WaitHelper.isAlertPresent().accept();
	}

	public static void dismiss() {
		WaitHelper.isAlertPresent().dismiss();
	}

	public static String getText() {
		return WaitHelper.isAlertPresent().getText();
	}

	public static void sendKeys(String value) {
		WaitHelper.isAlertPresent().sendKeys(value);
	}
}
