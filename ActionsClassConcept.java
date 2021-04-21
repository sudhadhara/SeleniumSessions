package SeleniumSessions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		//user actions: double click, right click, click, send keys
		//drag n drop , moveto element
		//Actions - class in Selenium
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");

		Actions act = new Actions(driver);
		
		WebElement content = driver.findElement(By.className("menulink"));
		act.moveToElement(content).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("COURSES")).click();
		
	}

}