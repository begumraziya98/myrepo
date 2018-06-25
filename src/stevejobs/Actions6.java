package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions6 
{
public static void main(String[] args) throws Exception 
{
		// Open browser
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	// Launch Site
	driver.get("http://jqueryui.com/slider/");
	driver.manage().window().maximize();
	// Goto Frame
	driver.switchTo().frame(0);
	// Automate Horizontal Slider
	WebElement e1=driver.findElement(By.xpath("//*[@id='slider']/span"));
	int x1=e1.getLocation().getX();
	int y1=e1.getLocation().getY();
	Actions a=new Actions(driver);
	// Automate Horizontal Slider from left to right
	a.dragAndDropBy(e1, x1+400,y1).build().perform();
	Thread.sleep(5000);
	// Automate Horizontal Slider from  right to left
	a.dragAndDropBy(e1,x1-100,y1).build().perform();
	// Back to Page
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Vertical slider")).click();
	driver.switchTo().frame(0);
	Thread.sleep(5000);
	// Automate Vertical Slider 
	WebElement e2=driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
	int x2=e2.getLocation().getX();
	int y2=e2.getLocation().getY();
	Thread.sleep(5000);
	// Automate vertical slider from top to bottom
	a.dragAndDropBy(e2,x2,y2+400).build().perform();
	Thread.sleep(5000);
	// Automate vertical slider from bottom to top
	a.dragAndDropBy(e2,x2,y2-200).build().perform();
	// Back to Page
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	// Close Site
	
	driver.close();

	}

}
