package stevejobs;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;

public class App11 
{
public static void main(String[] args) throws Exception
{
		// Start Appium Server
	Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
	// Get address of Appium server
	URL u=new URL("http://0.0.0.0:4723/wd/hub");
	// Provide app and device details
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(CapabilityType.BROWSER_NAME,"");
	dc.setCapability("deviceName","4200314a961674df");
	dc.setCapability("platformName","android");
	dc.setCapability("platformVersion","7.0");
	dc.setCapability("appPackage","com.sec.android.app.popupcalculator");
	dc.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
	// Create Object to launch app in device
	AndroidDriver driver;
	while(2>1)       // Infinite loop
	{
		try
		{
			driver=new AndroidDriver(u,dc);
			break;   // Terminate from loop
		}
		catch(Exception e)
		{
		}
	}
	// Check Network Connection Options
	try
	{
	Connection c=driver.getConnection();
	if(c.compareTo(Connection.AIRPLANE)==0)
	{
		System.out.println("AIRPLANE IS ON");
	}
	else
	{
		System.out.println("AIRPLANE IS OFF");	
	}
	if(c.compareTo(Connection.DATA)==0)
	{
		System.out.println("DATA IS ON");
	}
	else
	{
		System.out.println("DATA IS OFF");
		
	}
	if(c.compareTo(Connection.WIFI)==0)
	{
		System.out.println("WIFI IS ON");
	}
	else
	{
		System.out.println("WIFI IS OFF");	
		driver.setConnection(Connection.WIFI);
	}
	driver.setConnection(Connection.NONE);
	driver.setConnection(Connection.ALL);
}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
      // launch app
	driver.launchApp();
	//Close app
	driver.closeApp();
	 // Stop Appium-server
    Runtime.getRuntime().exec("taskkill /F /IM node.exe");
    Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
		
		
		
		
		
		
		
	}

}
