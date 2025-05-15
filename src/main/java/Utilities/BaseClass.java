package Utilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait w;
	
	public static WebDriver browserLaunch(String browser) {
		if(driver==null) {
				if(browser.equalsIgnoreCase("Chrome")){
					driver = new ChromeDriver();
				}
				else if(browser.equalsIgnoreCase("Edge")) {
					driver = new EdgeDriver();
				}
				else if(browser.equalsIgnoreCase("Firefox")) {
					driver = new FirefoxDriver();
				}
				w = new WebDriverWait(driver,Duration.ofSeconds(10));
			}
		return driver;
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void minimize() {
		driver.manage().window().minimize();
	}
	
	public static void onClick(WebElement ck) {
		ck.click();
	}
	
	public static void runURL(String url) {
		driver.get(url);
	}
	
	public static void sendValues(WebElement tbox, String send) {
		tbox.sendKeys(send);
	}
	
	public static void dDown (WebElement sl, String value) {
		Select s = new Select(sl);
		s.selectByValue(value);
	}
	
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static String getText (WebElement element) {
		return element.getText();
	}
	
	public static void explicitElementWait(WebElement buttonClickable) {
		w.until(ExpectedConditions.elementToBeClickable(buttonClickable));
		onClick(buttonClickable);
	}
	
	public static void explicitVisibleWait(WebElement buttonVisible) {
		w.until(ExpectedConditions.visibilityOf(buttonVisible));
		onClick(buttonVisible);
	}
	
	public static void javaScriptExecutorScrollAndClick(WebElement scrollAndClick) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", scrollAndClick);
		js.executeScript("arguments[0].click();", scrollAndClick);
	}
}
