package SeleniumSessions;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUpHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent page
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click(); //child page
		
		//window handler API in selenium:
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		System.out.println("parent window id: " + parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("child window id: " + childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("child window url:" + driver.getCurrentUrl());

		driver.close();//close the child window and driver is lost
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url:" + driver.getCurrentUrl());
		System.out.println("parent window title:" + driver.getTitle());
		
		driver.quit();

		
	}

}