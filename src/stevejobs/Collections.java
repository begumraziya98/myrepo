package stevejobs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collections 
{
public static void main(String[] args)
{
		//Launch Browser
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	// Launch Site
	driver.get("http://www.gmail.com");
	// Wait if Required
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	// Collecting all elements available in page //*(1 of 372) elements
	List<WebElement> l1=driver.findElements(By.xpath("//*"));
	System.out.println("Count of all elements is:"+l1.size());
	// Collect all links available in page
	List<WebElement> l2=driver.findElements(By.xpath("//a"));
	System.out.println("Count all links:"+l2.size());
	for(int i=0;i<l2.size();i++)
	{
		System.out.println(l2.get(i).getText());
	}
	// Collect all frames available in page
	List<WebElement> fl=driver.findElements(By.xpath("//iframe"));
	System.out.println(+fl.size());
	// Check Whether frames available or not in page
	if(+fl.size()>0)
	{
		System.out.println("Frames available in page");
	}
	else
	{
		System.out.println("No Frame in page");
	}
	// Display Count of forms
	List<WebElement> f=driver.findElements(By.xpath("//form"));
	System.out.println(+f.size());
	if(+f.size()>0)
	{
		System.out.println("form available in page");
	}
	else
	{
		System.out.println("No form in page");
	}
	// Count of text boxes in page
	List<WebElement> tb=driver.findElements(By.xpath("//input[@type='text']"));
	System.out.print(+tb.size());
	// Count of radio buttons in page
	List<WebElement> rb=driver.findElements(By.xpath("//input[@type='radio']"));
	System.out.print(+rb.size());
	// Get Count of Checkboxes available in page
	List<WebElement> cb=driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.print(+cb.size());
	// Get Count of Images in page
	List<WebElement> im=driver.findElements(By.xpath("(//input[@type='image'])|(//img)"));
	System.out.print(+im.size());
	
	// Close site
	driver.close();

	}

}
