package com.fb.login;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static int duration = 10;
	public static WebDriver driver;
	public static WebDriverWait webdriverWait;
	
	public static void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	public void waitClearAndSendText(WebElement element, String value) {
		webdriverWait(element);
		element.clear();
		element.sendKeys(value);
	}
	
	public void waitAndClick(WebElement element) {
		webdriverWait(element);
		element.click();
	}
	
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
	}
	
	public void webdriverWait(WebElement element) {
		webdriverWait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		webdriverWait.until(ExpectedConditions.visibilityOf(element));
	}
	
}
