package SeleniumSessions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//create the webelement + perform the action(click, sendkeys, get text, isDisplayed)
		//1. id:
		//1st:
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test123");
		
		//2nd:
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emailId.sendKeys("naveen@gmail.com");
//		password.sendKeys("test123");
		
		//3rd: By locators:
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		driver.findElement(emailId).sendKeys("naveen@gmail.com");
//		driver.findElement(password).sendKeys("test@123");
		
		//4th: By locators + webelement
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement email_ele = driver.findElement(emailId);
//		WebElement password_ele = driver.findElement(password);
//		
//		email_ele.sendKeys("naveen@gmail.com");
//		password_ele.sendKeys("test@123");
		
		//5th: generic method
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(emailId, "naveen@gmail.com");
//		getElement(password, "test@123");
		
		//6th:
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		doSendKeys(emailId, "naveen@gmail.com");
		doSendKeys(password, "test@123");
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	
	
	
	

}