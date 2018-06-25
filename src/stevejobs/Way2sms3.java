package stevejobs;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Way2sms3
{
public static void main(String[] args) throws Exception 
{
	// Open Browser
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	// Launch Site
	driver.get("http://site24.way2sms.com/entry.jsp");
	WebDriverWait w=new WebDriverWait(driver,100);
	w.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	// Do login
	driver.findElement(By.name("username")).sendKeys("7032675435");
	driver.findElement(By.name("password")).sendKeys("android123");
	driver.findElement(By.id("loginBTN")).click();
	driver.findElement(By.xpath("//*[text()='Send SMS']")).click();
	//driver.switchTo().frame("frame");
	w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame"));
	driver.findElement(By.name("mobile")).sendKeys("7032675435");
	driver.findElement(By.name("message")).sendKeys("Testing way2sms via Automation");
	driver.findElement(By.name("Send")).click();
	driver.switchTo().defaultContent();
	
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Install Chrome Plugin'])[1]")));
	
	if(driver.findElement(By.xpath("(//*[text()='Install Chrome Plugin'])[1]")).isDisplayed())
	{
		driver.findElement(By.xpath("(//*[text()='Install Chrome Plugin'])[1]")).click();
		Thread.sleep(10000);
		Robot r=new Robot();
		for(int i=1;i<=2;i++)
		{
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(5000);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
	}
	driver.switchTo().frame("frame");
	try
	{
	if(driver.findElement(By.xpath("//*[@class='ssms consuki ']/following-sibling::span")).isDisplayed())
	{
		System.out.println("Message was send sucessfully");
	}
	}
	catch(Exception e)
	{
       System.out.println("Message send was failed");
	}
	// Do logout
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//*[@class='out louti']")).click();
	w.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	// Close Site
	driver.close();
	
}
}