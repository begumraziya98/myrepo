package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Select2 
{
public static void main(String[] args) throws Exception
{
	//Open browser
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	// Launch Site
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	// Maximize the page
	driver.manage().window().maximize();
	// Changing Focus of driver object from page level to frame level
	driver.switchTo().frame("iframeResult");
	// Create DOM to Element
	WebElement e=driver.findElement(By.name("cars"));
	Select s=new Select(e);
	// Get Count of all items in drop-down
	int c=s.getOptions().size();
	System.out.println(+c);
	// Display all items in drop-down
	for(int i=0;i<c;i++)
	{
	String x=s.getOptions().get(i).getText();
	System.out.println(x);
	}
	// To Check drop-down is Single select drop-down or Multi-select drop-down
	if(s.isMultiple())
	{
		System.out.println("Multi select drop-down" );
		// On Which Page driver object is working on same action object(a) is working
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL).build().perform();
		a.click(s.getOptions().get(2)).build().perform();
		a.click(s.getOptions().get(3)).build().perform();
		a.keyUp(Keys.CONTROL).build().perform();
	}
	else
	{
		System.out.println("Single select dropdown");
	}
	// Collect all selected options in multi-slect drop-down
	 int y=s.getAllSelectedOptions().size();
	 System.out.println(+y);
	 // Get 1st Selected item in multi-select drop-down
	 String z=s.getFirstSelectedOption().getText();
	 Thread.sleep(5000);
	 // To deselect all selected items in multi-select drop-down
	 s.deselectAll();
	 // Deselect item in multi-select drop-down by givng text of item
	 s.deselectByVisibleText("Audi");
	 // Deslect item in multi-slect drop-down by giving index for that item
	 s.deselectByIndex(3);
	 //Deselect item in multi-slect drop-down by giving value of item in souce code
	 s.deselectByValue("audio");
    // Close Site
	 driver.close();
	}

}
