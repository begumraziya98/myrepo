package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome 
{
public static void main(String[] args) 
	{
		// Run Chromedriver.exe to get chrome browser
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	// Create Object to acess chrome browser
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.gmail.com");
	
	

	}

}
