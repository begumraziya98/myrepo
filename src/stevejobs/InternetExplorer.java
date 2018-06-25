package stevejobs;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer
{
public static void main(String[] args)
{
		// Run iedriverserver.exe to get IE Browser
	System.setProperty("webdriver.ie.driver","E:\\raziya238\\iedriverserver.exe");
	// Create Object to acess ie browser
	InternetExplorerDriver driver=new InternetExplorerDriver();
	// Site Launch
	driver.get("https://www.seleniumhq.org/");

	}

}
