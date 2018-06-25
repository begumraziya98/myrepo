package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Actions2
{
public static void main(String[] args) 
{
	// Open browser
	OperaOptions op=new OperaOptions();
	op.setBinary("C:\\Program Files\\Opera\\52.0.2871.40\\opera.exe");
	System.setProperty("webdriver.opera.driver","E:\\raziya238\\operadriver_win64\\operadriver.exe");
	OperaDriver driver=new OperaDriver(op);
	//Launch Site
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	// Move Mouse Pointer to Element
	driver.findElement(By.xpath("//*[@id='container']/following::button[1]")).click();
	WebElement e=driver.findElement(By.xpath("//*[text()='Women']"));
	Actions a=new Actions(driver);
	a.moveToElement(e).build().perform();
	// Close Site
	driver.close();
	

	}

}
