package SeleniumSessions;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Customxpath_2 {
	
	static WebDriver driver;

	public static void main(String[] args) {

		//a[text()='Devisha Sharma']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='Neha Patel']/parent::td/preceding-sibling::td/input[@type='checkbox']
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.linkText("CONTACTS")).click();
		
		selectContact("Devisha Sharma");
		selectContact("David ");
		System.out.println(getCompName("Devisha Sharma"));
		System.out.println(getPhoneNumber("Devisha Sharma"));
		System.out.println(getEmailID("Devisha Sharma"));
	}
	
	public static void selectContact(String name) {
		String xpath = "//a[text()='"+name+"']/parent::td/preceding-sibling::td/input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();
	}
	
	//a[text()='Devisha Sharma']/parent::td/following-sibling::td/a
	
	public static String getCompName(String name) {
		String xpath = "//a[text()='"+name+"']/parent::td/following-sibling::td/a";
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public static String getPhoneNumber(String name) {
		String xpath = "//a[text()='"+name+"']/parent::td/following-sibling::td/span";
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public static String HomePhoneNumber(String name) {
		String xpath = "//a[text()='"+name+"']/parent::td/following-sibling::td/span";
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public static String getEmailID(String name) {
		
		String email="//a[text()='test@gmail.com']";
		
		return driver.findElement(By.xpath(email)).getText();
	}

	/**
	 * inpunt: name
	 * return: the list of all the information right side: phone, email, comp
	 */
	public static List<String> getContactsInfo(String name) {
		String compName = getCompName(name);
		String ph = getPhoneNumber(name);
		String email=getEmailID(name);
		
		
		List<String> contactInfoList = new ArrayList<String>();
		contactInfoList.add(compName);
		contactInfoList.add(ph);
		contactInfoList.add(email);
		
		return contactInfoList;
		
	}
	
	
	
}