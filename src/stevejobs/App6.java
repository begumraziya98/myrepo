package stevejobs;

import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class App6 
{
public static void main(String[] args)  throws Exception
{
	// Get mobile number to dial
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Mobile Number");
	String x=sc.nextLine();
	// Start appium-server
	Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
	// Get address of appium-server
	URL u=new URL("http://0.0.0.0:4723/wd/hub");
	// Provide app and device details
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(CapabilityType.BROWSER_NAME,"");
	dc.setCapability("deviceName","4200314a961674df");
	dc.setCapability("platformName","android");
	dc.setCapability("platformVersion","7.0");
	dc.setCapability("appPackage","com.samsung.android.contacts");
	dc.setCapability("appActivity","com.android.dialer.DialtactsActivity");
		// Create object to launch app in device
		AndroidDriver driver;
		while(2>1)
		{
			try
			{
				driver=new AndroidDriver(u,dc);
				break;
			}
			catch(Exception e)
			{
		    }
		}
			// App automation
			try
		{
			// Automate app screen elements 
	       driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	       // Click on dial pad
	       //driver.findElement(By.xpath("//*[@content-desc='dial pad']")).click();
	       // Dial anumber and click on end call 
	       
	       for(int i=0;i<x.length();i++)
	       {
	    	   
	    	   char y=x.charAt(i);
	    	   driver.findElement(By.xpath("//*[@text='"+y+"']")).click();
	       }
	       driver.findElement(By.xpath("//*[@content-desc='Call']")).click();
	       // Wait few sceonds
	       Thread.sleep(5000);
	       // Click on end call
	       driver.findElementByAndroidUIAutomator("new UiSelector().description(\"End call\")").click();
	      }
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			// Close app
			driver.closeApp();
			
			// Stop appium server programmatically
			Runtime.getRuntime().exec("taskkill /F /IM node.exe");
			Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
		    

	}

}
