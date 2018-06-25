package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Manage1 
{
public static void main(String[] args) 
{
	// Open browser
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	// Delete all existing Cookies
	driver.manage().deleteAllCookies();
	// Launch Site
	driver.get("http://www.gmail.com");
	// Cookies testing
	if(driver.manage().getCookies().size()!=0)
	{
		System.out.println("Cookies were Loaded");
	}
	else
	{
		System.out.println("Cookies were not Loaded");
	}
	// Close Site
	driver.close();

	}

}
