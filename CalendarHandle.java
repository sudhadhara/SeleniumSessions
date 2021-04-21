//package SeleniumSessions;
//
//
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class CalendarHandle {
//	static WebDriver driver;
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
//
//		driver.findElement(By.id("datepicker")).click();
//		Thread.sleep(2000);
//		// selectDate("25");
//
//		By calendar = By.cssSelector("table.ui-datepicker-calendar a");
//		//selectDate(calendar, "24");
//		selectDate("15", "a");
//		
//		//curentMonthYear = display monthYear text
//		//while(!(curentMonth == expMonth && curentYear == expYear))
//				//click next icon
//				
//		//call selectDate(date) method
//		
//	}
//
//	public static void selectDate(String day, String htmlTag) {
//		driver.findElement(By.xpath("//"+htmlTag+"[text()='" + day + "']")).click();
//	}
//
//	public static void selectDate(By locator, String day) {
//		List<WebElement> daysList = driver.findElements(locator);
//
//		System.out.println(daysList.size());
//
//		for (WebElement e : daysList) {
//			if (e.getText().equals(day)) {
//				e.click();
//				break;
//			}
//		}
//
//	}
//
//}
package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		// selectDate("25");

		By calendar = By.cssSelector("table.ui-datepicker-calendar a");
		//selectDate(calendar, "24");
		selectDate("15", "a");
		
		//curentMonthYear = display monthYear text
		//while(!(curentMonth == expMonth && curentYear == expYear))
				//click next icon
				
		//call selectDate(date) method
		
	}

	public static void selectDate(String day, String htmlTag) {
		driver.findElement(By.xpath("//"+htmlTag+"[text()='" + day + "']")).click();
	}

	public static void selectDate(By locator, String day) {
		List<WebElement> daysList = driver.findElements(locator);

		System.out.println(daysList.size());

		for (WebElement e : daysList) {
			if (e.getText().equals(day)) {
				e.click();
				break;
			}
		}

	}

}