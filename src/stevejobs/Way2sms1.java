package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Way2sms1 
{
public static void main(String[] args) 
{
		// Open browser
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	// Launch Site
	driver.get("http://site21.way2sms.com/");
	// Wait if Required 
	driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
	// Do Login
	driver.findElement(By.name("username")).sendKeys("7032675435");
	driver.findElement(By.name("password")).sendKeys("android123");
	driver.findElement(By.id("loginBTN")).click();
    driver.findElement(By.xpath("//a[text()='Send SMS']")).click();
    driver.switchTo().frame("frame");
    driver.findElement(By.xpath("//*[@placeholder='Mobile Number']")).sendKeys("7032675435");
    driver.findElement(By.xpath("//*[contains(@placeholder,'Type your message here')]")).sendKeys("Testing Way2sms site via Automation");
	driver.findElement(By.xpath("//*[@value='Send SMS']")).click();
	driver.switchTo().defaultContent();
	// Close Site
	driver.close();
	
}

}
