package stevejobs;

import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class App14 
{
public static void main(String[] args) throws Exception
{
	// Start Appium Server
        Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
	// Get address of appium server
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
	//Provide app and device details
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","4200314a961674df");
		dc.setCapability("platforName","android");
		dc.setCapability("platformVersion","7.0");
		dc.setCapability("appPackage","com.cricbuzz.android");
		dc.setCapability("appActivity","com.cricbuzz.android.lithium.app.view.activity.NyitoActivity");
	// Create driver object to launch device 
		AndroidDriver driver;
		while(2>1)   // infinite loop
		{
			try
			{
				driver=new AndroidDriver(u,dc);
				break;  //terminate from currently running loop
			}
			catch(Exception e)
			{
			}
		}
	// Automate app screen elements
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@bounds='[944,68][1080,204]']")).click();
		driver.findElement(By.xpath("//*[@class='android.widget.ImageButton']")).click();
		driver.findElement(By.xpath("//*[@text='News']")).click();
		// Get Context related to app
		  ArrayList<String> al=new ArrayList<String>(driver.getContextHandles());
		  for(int i=0;i<al.size();i++)
		  {
			  System.out.println(al.get(i));
		  }
		//Get Current context app
		  String x=driver.getContext();
		  System.out.println(x);
		  // Chane context to NATIVE_APP when app in WEB_VIEW
		  if(driver.isBrowser())
		  {
			  driver.context("NATIVE_APP");
		  }
	// Closeapp
	   driver.closeApp();
   // Stop Appium server
	    Runtime.getRuntime().exec("taskkill /F /IM node.exe");
	    Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");

	}

}
