package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Way2sms2 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	// Launch Site
	driver.get("http://site21.way2sms.com/");
	// Get Text into alert & Display text
	driver.findElement(By.name("username")).sendKeys("7032675434");
	driver.findElement(By.id("loginBTN")).click();
	String x=driver.switchTo().alert().getText();
	System.out.println(x);
	// To Close alert 
	driver.switchTo().alert().accept();
	
	//Cloe Site
	driver.close();

}
}