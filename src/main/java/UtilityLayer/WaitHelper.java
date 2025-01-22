package UtilityLayer;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class WaitHelper extends BaseClass {

	public static WebElement visibilityOf(WebElement wb) {

		return new WebDriverWait(getDriver(), Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(fluentWait(wb)));
	}

	public static List<WebElement> visibilityOfAllElements(List<WebElement> list) {

		return new WebDriverWait(getDriver(), Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfAllElements(list));
	}

	public static WebElement elementToBeClickable(WebElement wb) {

		return new WebDriverWait(getDriver(), Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(fluentWait(wb)));
	}

	public static Alert isAlertPresent() {
		return new WebDriverWait(getDriver(), Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent());
	}

	public static WebElement fluentWait(WebElement wb) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);

		return wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return wb;
			}
		});

	}

}
