package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions1 
{
public static void main(String[] args) 
{
		// Open bowser
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe" );
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	// Launch Site
	driver.get("https://www.gmail.com");
	Actions a=new Actions(driver);
	WebElement e1=driver.findElement(By.name("identifier"));
	// Double Click on an Element Using ACTIONS
	a.doubleClick(e1).build().perform();
	// Fill an element using Actions
	a.sendKeys(e1,"begumraziya98@gmail.com").build().perform();
	// Click on an Elment Using ACTIONS
	WebElement e2=driver.findElement(By.id("identifierNext"));
	a.click(e2).build().perform();
	WebDriverWait w=new WebDriverWait(driver,100);
	w.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	// Close Site
	driver.close();
	
	

	}

}
