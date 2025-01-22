package UtilityLayer;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class BrokenLinks extends BaseClass {

	public static void findBrokenlink(List<WebElement> lists) throws Exception {

		int totalLinks = lists.size();
		int validLinks = 0;
		int brokenLinks = 0;

		for (WebElement wb : WaitHelper.visibilityOfAllElements(lists)) {
			String actualUrl = WebElementHelper.getAttribute(wb, "href");

			if (actualUrl == null || actualUrl.isEmpty()) {
				brokenLinks++;
				continue;
			} else if (actualUrl.startsWith("http")) {
				URL url = new URL(actualUrl);
				URLConnection urlcon = url.openConnection();
				HttpURLConnection httpUrl = (HttpURLConnection) urlcon;
				httpUrl.connect();
				int reponseCode = httpUrl.getResponseCode();

				if (reponseCode < 400) {
					validLinks++;

				} else {
					brokenLinks++;

				}
			} else {
				brokenLinks++;

			}
		}

		System.out.println("Total Links in Web Page " + totalLinks);
		System.out.println("Total Valid Links in Web Page " + validLinks);
		System.out.println("Total Broken Links in Web Page " + brokenLinks);

	}

}
