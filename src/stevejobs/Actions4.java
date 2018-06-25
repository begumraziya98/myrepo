package stevejobs;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions4 
{
public static void main(String[] args) throws Exception 
{
	// Take two words from Keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word to search");
		String x=sc.nextLine();
		System.out.println("Enter expected suggestion");
		String y=sc.nextLine();
	// Open Browser
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	// Launch Site     
	driver.get("http://www.google.co.in");
    driver.manage().window().maximize();
    // Automate item selection in auto-complete element
    WebElement e=driver.findElement(By.name("q"));
    Actions a=new Actions(driver);
    a.sendKeys(e,x).build().perform();
    int c=1;
    while(2>1) // infinite loop
    {
    	String z=e.getAttribute("value");
    	if(z.equals(y))
    	{
    		System.out.println("Suggetion was found");
    		a.sendKeys(Keys.ENTER).build().perform();
    		break;  // Terminate from loop
    	}
    	else
    	{
    		//if(c==10) 
    		if(c>10)
    		{
    			System.out.println("Suggestion was not found");
    			break; // Terminate from loop
    			
    		}
    		else
    		{
    			a.sendKeys(Keys.DOWN).build().perform();
    			c=c+1;
    		}
    	}
    }
    // Close Site
    driver.close();
    
	
	

	}

}
