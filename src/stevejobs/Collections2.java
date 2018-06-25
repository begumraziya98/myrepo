package stevejobs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Collections2 
{
public static void main(String[] args) 
{
       //Launch Browser
	     System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
      // Launch Site
	    driver.get("http://www.gmail.com");
	  // Automate GMAIL Site via Collection 
	    driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
	    driver.findElement(By.name("identifier")).sendKeys("begumraziya98");
	    driver.findElement(By.id("identifierNext")).click();
	    driver.findElement(By.name("password")).sendKeys("rameeza98");
	    WebElement e=driver.findElement(By.id("identifierNext"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",e);
	    List<WebElement> rl=driver.findElements(By.xpath("(//*[@role='tabpanel'])[1]/descendant::table/tbody/tr"));
	    System.out.println(rl.size());
	    List<WebElement> cl=rl.get(1).findElements(By.tagName("td"));
	    System.out.println(cl.size());
	    List<WebElement> cb=cl.get(1).findElements(By.tagName("div"));
	    cb.get(0).click();
	  // Click on Sign out
	     driver.findElement(By.xpath("//*[contains(@title,'Google Account')] ")).click();
	     driver.findElement(By.xpath("//*[text()='Sign out']")).click();
     // Close site
	     driver.close();
	     /* Errors while executing program
	     (1).Click effect not performing after entered password(used Actions not working,used javascript executor)
	     (2)iven implivity wait 100 seconds; ELEMENTNOT VISIBLE error got(Increased time code executed)*/

	}

}
