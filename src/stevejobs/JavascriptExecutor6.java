package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor6 
{
public static void main(String[] args) 
{
		// Open browser
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	// Launch Site
	driver.get("https://www.google.co.in");
	driver.manage().window().maximize();
	// Get tool-tip of textbox
	WebElement e1=driver.findElement(By.name("q"));
	String x=e1.getAttribute("title");
	System.out.println(x);
	// Get tool-tip of icon
	//WebElement e2=driver.findElement(By.xpath("//*[@class='gsri_a']/parent::*"));
	WebElement e2=driver.findElement(By.xpath("//*[@aria-label='Search by voice']"));
	String y=e2.getAttribute("aria-label");
	System.out.println(y);
	// Close Site
	driver.close();

	}

}
