package stevejobs;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
public class App2 
{
public static void main(String[] args) throws Exception 
{
	// Start Appium-Server
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
	// Get address of apium server
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
		// Automate app screen elements 
		try
		{
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		String x="7032675435";
		for(int i=0;i<x.length();i++)
		{
			char y=x.charAt(i);
			String z="";
			switch(y)
			{
			case '0':
				z="zero";
				break;
			case '1':
				z="one";
				break;
			case '2':
				z="two";
				break;
			case '3':
				z="three";
				break;
			case '4':
				z="four";
				break;
			case '5':
				z="five";
				break;
			case '6':
				z="six";
				break;
			case '7':
				z="seven";
				break;
			case '8':
				z="eight";
				break;
			case '9':
				z="nine";
				break;
				default:
					System.out.println("Wrong digit");
					break;
				}
			driver.findElement(By.xpath("//*[@content-desc='"+z+"']")).click();
		    Thread.sleep(5000);
		}
	}
	     catch(Exception e)
	     {
	    	 System.out.println(e.getMessage());
	     }
		// Stop appium-server programmaticaly
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	}
	
}


