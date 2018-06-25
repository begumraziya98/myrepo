package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions5 
{
public static void main(String[] args) 
{
	// Open Browser
	System.setProperty("webdriver.gecko.driver","E:\\raziya238\\geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	// Launch Site
	driver.get("http://jqueryui.com/droppable/");
	driver.switchTo().frame(0);
	WebElement e1=driver.findElement(By.id("draggable"));
	WebElement e2=driver.findElement(By.id("droppable"));
	Actions a=new Actions(driver);
	a.dragAndDrop(e1,e2).build().perform();	
	driver.switchTo().defaultContent();
	WebDriverWait w=new WebDriverWait(driver,100);
	w.until(ExpectedConditions.invisibilityOfElementLocated(By.id("droppable")));
	// Close Site
	driver.close();
	}

}
