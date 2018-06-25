package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JvascriptExecutor5
{
public static void main(String[] args) throws InterruptedException 
{
	// Open browser
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	// Launch Site
	driver.get("https://www.google.co.in");
	Thread.sleep(5000);
	// Disable Text box 
	WebElement e=driver.findElement(By.name("q"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('disabled',true);",e);
	Thread.sleep(5000);
	js.executeScript("arguments[0].removeAttribute('disabled');",e);
	// Close Site
	driver.close();
	

	}

}
