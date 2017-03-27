package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
static WebDriver driver;
	
	
	//Opens the browser of choice and returns driver of type WebDriver
	public static  WebDriver startBrowser(String browserName, String url)
	{
		
		if(browserName.equals("Firefox")){
			driver = new FirefoxDriver();
			}
		else if (browserName.equals("Chrome")){
			driver = new ChromeDriver();
			
		}
		else if (browserName.equals("IE")){
			driver = new InternetExplorerDriver();
			
		}
		driver.manage().window().maximize();
		driver.get(url);
		
		
		return driver;
		
		
	}

}
