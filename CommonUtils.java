package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

//public abstract class CommonUtils {
	public class    CommonUtils {


	    public WebDriver driver;
	    public WebDriverWait wait;
	    public Actions actions;

	    //WebDriver driver;
	    
	    public void CommonUtils1() {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Sudha\\Downloads\\chromedriver_win32\\chromedriver.exe");;

			//WebDriver driver = new ChromeDriver();
	    	WebDriverManager.chromedriver().setup();
	    	driver = new ChromeDriver();
	    }

	    public void launchUrl(String url) {
			driver.get(url);
		}
	    

	    public String getPageTitle() throws Exception {
	        try {
	            System.out.print(String.format("The title of the page is: %s\n\n", driver.getTitle()));
	            return driver.getTitle();
	        } catch (Exception e) {
	            throw new Exception(String.format("Current page title is: %s", driver.getTitle()));
	        }
	    }

	    public WebElement getElement(By selector) {
	        try {
	            return driver.findElement(selector);
	        } catch (Exception e) {
	            System.out.println(String.format("Element %s does not exist - proceeding", selector));
	        }
	        return null;
	    }


	    public String getPageUrl() {
			return driver.getCurrentUrl();
		}
		

	    public void sendKeys(By selector, String value) throws Exception {
	        WebElement element = getElement(selector);
	        //clearField(element);
	        try {
	            element.sendKeys(value);
	        } catch (Exception e) {
	        	throw new Exception(String.format("Error in sending [%s] to the following element: [%s]", value, selector.toString()));
	        }
	    }
	        public void closeBrowser() {
	        	driver.close();
	    }

	    
	    
}

