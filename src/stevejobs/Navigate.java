package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate 
{
public static void main(String[] args)
	{
		// Open browser
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	// Launch Site
	driver.get("https://www.gmail.com");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	// Redirect to other Site
	driver.navigate().to("https://www.facebook.com");
	// Back to Previous page
	driver.navigate().back();
	// Forward to next page(Already visited page,visiting once again)
	driver.navigate().forward();
	// Reload Current Page
	driver.navigate().refresh();
	// Close Site
	driver.close();

	}

}
