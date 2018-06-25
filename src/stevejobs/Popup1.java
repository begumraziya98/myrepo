package stevejobs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Popup1 
{
public static void main(String[] args) throws AWTException, InterruptedException 
{
		// Open Browser(SWD)
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	// Launch Site(SWD)
	driver.get("https://www.seleniumhq.org/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Download")).click();
	Actions a=new Actions(driver);
	// Right click on element(SWD)
	WebElement e=driver.findElement(By.linkText("Download"));
	a.contextClick(e).build().perform();
	// Select 2nd Option in Winmenu(Java Robot)
	Robot r=new Robot();
	for(int i=1;i<=2;i++)
	{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
	}
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	// Close Site
    driver.quit();
	}

}
