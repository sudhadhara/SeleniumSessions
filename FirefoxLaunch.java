package SeleniumSessions;



import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxLaunch {

	public static void main(String[] args) {

		// geckodriver - Mozilla

		System.setProperty("webdriver.chrome.driver", "C:\\Sudha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Sudha\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");

		//WebDriver driver = new FirefoxDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();//launch browser

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

		System.out.println(driver.getPageSource());

		driver.quit();
	}

}
