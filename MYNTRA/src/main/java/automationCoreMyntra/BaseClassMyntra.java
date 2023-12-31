package automationCoreMyntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClassMyntra
{
	public WebDriver driver;
	
	public WebDriver browserIntialize(String Browser) throws Exception
	{
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (Browser.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		else if(Browser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			throw new Exception("Not valid");
		}
		return driver;
	}

}
