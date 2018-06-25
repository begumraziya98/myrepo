package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1 
{
public static void main(String[] args)
{
	// Open browser 
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	// Launch Site
	driver.get("https://www.mercurytravels.co.in/");
	driver.manage().window().maximize();
	WebElement e=driver.findElement(By.name("nights"));
	Select s=new Select(e);
	if(s.isMultiple())
	{
		System.out.println("Multi-select dropdown");
	}
	else
	{
		System.out.println("Single Slect dropdown");
	}
	// To select item in dropdown by that giving item text
	s.selectByVisibleText("2Nights+3Days");
	// To select item in dropdown by giving index for that item
	s.selectByIndex(3);
	// To select item in dropdown by giving that item value
	s.selectByValue("2Nights / 3Days");
	// To Collect all items in dropdown 
	int c=s.getOptions().size();
	System.out.println(+c);
	// Display all items available in drop-down
	for(int i=0;i<c;i++)
	{
	  String x=s.getOptions().get(i).getText();
	  System.out.println(x);
	}
	// Close Site
	driver.close();
	


	}

}
