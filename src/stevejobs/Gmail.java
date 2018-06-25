package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gmail
{
public static void main(String[] args) 
{
	// Open Browser
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	// Launch Site
	driver.get("https://www.gmail.com");
	driver.findElement(By.name("identifier")).sendKeys("begumraziya98@gmail.com");
    driver.findElement(By.xpath("//*[text()='Next']")).click();
    driver.findElement(By.name("password")).sendKeys("rameeza98");
    WebElement e= driver.findElement(By.xpath("//*[text()='Next']"));
    JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();",e);
    // Select 2nd row 2nd Column  Checkbox
    driver.findElement(By.xpath("(//*[@role='tabpanel'])[1]/descendant::table/tbody/tr[2]/td[2]")).click();
    driver.findElement(By.xpath("//*[contains(@title,'Google Account')]/span")).click();
    driver.findElement(By.linkText("Sign out")).click();
    // Close Site
    driver.close();
	}

}
