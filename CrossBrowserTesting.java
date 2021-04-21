package SeleniumSessions;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		WebDriver driver = null;
		String browser = "chrome";

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Sudha\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Sudha\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			//System.setProperty("webdriver.safari.driver", "");
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("Please pass the correct browser....");
		}

		driver.get("http://www.google.com");// enter the url

		String title = driver.getTitle(); // get the title
		System.out.println("page title is: " + title);

		// verification/checkpoint: act vs exp:
		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("in-correct title");
		}

		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.quit();

	}

}