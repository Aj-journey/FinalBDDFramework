package UtilityLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import BaseLayer.BaseClass;

public class WindowHelper extends BaseClass {

	public static void windowHandle(Set<String> allWindow, int windowIndex) {
		Iterator<String> it = allWindow.iterator();

		ArrayList<String> allArrayWindow = new ArrayList<String>();

		while (it.hasNext()) {
			String windowId = it.next();
			allArrayWindow.add(windowId);
		}

		getDriver().switchTo().window(allArrayWindow.get(windowIndex));

	}

}
