package stevejobs;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class App8 {
public static void main(String[] args) throws Exception
{
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
	dc.setCapability("appPackage","com.google.android.apps.maps");
	dc.setCapability("appActivity","com.google.android.maps.MapsActivity");
	dc.setCapability("locationServicesEnabled",true);
	dc.setCapability("locationServicesAuthorized",true);
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
				driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		 //  Current Location To banglore
			Thread.sleep(10000);
	       Location l1=new Location(12.971599,77.594563,2000);
	       driver.setLocation(l1);
	       Thread.sleep(10000);
	     // Banglore to vijayawada
	       Location l2=new Location(16.506174,80.648015,2000);
	       driver.setLocation(l2);
		}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			//Launch app
			driver.launchApp();
		 // Close app
			driver.closeApp();
		 // Stop appium server programmatically
			Runtime.getRuntime().exec("taskkill /F /IM node.exe");
			Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");

	}

}
