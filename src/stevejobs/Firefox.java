package stevejobs;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox 
{
public static void main(String[] args) 
{
		// Run geckodriver.exe to get Firefox browser
	System.setProperty("webdriver.gecko.driver","E:\\raziya238\\geckodriver.exe");
	// Create Object to get Firefox Browser
	FirefoxDriver driver=new FirefoxDriver();
	//Launch Site
	driver.get("http://www.google.co.in");

	}

}
