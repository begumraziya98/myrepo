package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions3
{
public static void main(String[] args) throws Exception 
{
		//Launch Browser
	OperaOptions op=new OperaOptions();
	// Path of Opera browser downloaded in system
	op.setBinary("C:\\Program Files\\Opera\\52.0.2871.40\\opera.exe");
    System.setProperty("webdriver.opera.driver","E:\\raziya238\\operadriver_win64\\operadriver.exe");
    OperaDriver driver=new OperaDriver(op);
    // Launch Site
    driver.get("http://www.google.co.in");
    WebDriverWait w=new WebDriverWait(driver,100);
    w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
    WebElement e=driver.findElement(By.name("q"));
    Actions a=new Actions(driver);
    a.sendKeys(e,"kalam").build().perform();
    for(int i=1;i<=4;i++)
    {
    	a.sendKeys(Keys.DOWN).build().perform();
    	Thread.sleep(5000);
    }
    a.sendKeys(Keys.ENTER).build().perform();
    Thread.sleep(5000);
    
	}

}
