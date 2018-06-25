package stevejobs;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class App7 
{

public static void main(String[] args) throws Exception
{
		//Start appium-server
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
	       
	       String x=driver.getOrientation().name();
	       System.out.print(x);
	       if(x.equals("PORTRAIT"))
	       {
	    	   driver.rotate(ScreenOrientation.LANDSCAPE);
	       }
	       driver.lockDevice();
	       if(driver.isLocked())
	       {
	    	   System.out.println("Locked");
	    	   driver.unlockDevice();
	       }
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
