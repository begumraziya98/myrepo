package stevejobs;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class App13 
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
	dc.setCapability("appPackage","com.google.android.apps.maps");
	dc.setCapability("appActivity","com.google.android.maps.MapsActivity");
	dc.setCapability("locationServicesEnabled",true);
	dc.setCapability("locationServicesAuthorized",true);
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
	// Get Performance details
	try
	{
		List<String> pl=driver.getSupportedPerformanceDataTypes();
		for(int i=0;i<pl.size();i++)
		{
			System.out.print(pl.get(i)+ "\t");
		}
		System.out.println();
		// Get Performance Data
		System.out.println("Cpu information:");
		List<List<Object>> ci=driver.getPerformanceData("com.google.android.apps.maps","cpuinfo",10000);
		for(int i=0;i<ci.size();i++)
		{
			for(int j=0;j<ci.get(i).size();j++)
			{
				try
				{
					System.out.print(ci.get(i).get(j).toString()+ "\t");
				}
				catch(Exception e)
				{
					System.out.print(0);
				}
				
			}
			System.out.println("");
		}
		System.out.println("Battery information:");
		List<List<Object>> bi=driver.getPerformanceData("com.google.android.apps.maps","batteryinfo",10000);
		for(int i=0;i<bi.size();i++)
		{
			for(int j=0;j<bi.get(i).size();j++)
			{
				try
				{
					System.out.print(bi.get(i).get(j).toString()+ "\t");
				}
				catch(Exception e)
				{
					System.out.print(0);
				}
				
			}
			System.out.println("");
		}
		System.out.println("Memory information:");
		List<List<Object>> mi=driver.getPerformanceData("com.google.android.apps.maps","memoryinfo",10000);
		for(int i=0;i<mi.size();i++)
		{
			for(int j=0;j<mi.get(i).size();j++)
			{
				try
				{
					System.out.print(mi.get(i).get(j).toString()+ "\t");
				}
				catch(Exception e)
				{
					System.out.print(0);
				}
				
			}
			System.out.println("");
		}
		System.out.println("Network information:");
		List<List<Object>> ni=driver.getPerformanceData("com.google.android.apps.maps","networkinfo",10000);
		for(int i=0;i<ni.size();i++)
		{
			for(int j=0;j<ni.get(i).size();j++)
			{
				try
				{
					System.out.print(ni.get(i).get(j).toString()+ "\t");
				}
				catch(Exception e)
				{
					System.out.print(0);
				}
				
			}
			System.out.println("");
		}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	// Closeapp
	    driver.closeApp();
      // Stop Appium-server
      Runtime.getRuntime().exec("taskkill /F /IM node.exe");
      Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");

	}

}
