package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//For Windows Server 
		System.setProperty("webdriver.chrome.driver", "C:\\Sudha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Top Casting - Child class object referred by parent class variable
		//To launch a browser
		WebDriver Driver=new ChromeDriver();
		
		//get the URL
		Driver.get("http://mail.yahoo.com");
		
		//To get the title
		String title=Driver.getTitle();
		System.out.println("This page title is " +title );
		
		//Verification/Validation i.e Actual Versus expected or checkpoint
		if(title.equals ("Yahoo Mail")) {
			System.out.println("The title is correct");	
			
		}
		else
		{
			System.out.println("The title is incorrect");	
		}
		Driver.quit();
		}
		}

	


