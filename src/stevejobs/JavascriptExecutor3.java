package stevejobs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor3 
{
public static void main(String[] args) 
{
	// Open Browser
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	// Launch Site
	driver.get("https://www.gmail.com");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	// Create alert
	js.executeScript("alert('Ammi is one Testing Job');");
	// Close Site
	driver.close();

	}

}
