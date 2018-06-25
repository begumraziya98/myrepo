package stevejobs;
import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class App17
{
public static void main(String[] args) throws Exception
{
		//Start appium server
	Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
	// Get address of appium server
	URL u=new URL("http://0.0.0.0:4723/wd/hub");
	//Provide app and device details
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(CapabilityType.BROWSER_NAME,"");
	dc.setCapability("deviceName","emulaor-5554");
	dc.setCapability("platforName","android");
	dc.setCapability("platformVersion","4.2.2");
	dc.setCapability("appPackage","com.android.calendar");
	dc.setCapability("appActivity","com.android.calendar.AllInOneActivity");
	
	
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
	// Automate app screen
	try
	{
	// Perform swipe for required element
	driver.context("NATIVE_APP");
	int w=driver.manage().window().getSize().getWidth();
	int h=driver.manage().window().getSize().getHeight();
	TouchAction ta=new TouchAction(driver);
	// Swipe from right to left
	int x1=(int) (w*0.9);
	int y1=(int) (h/2);
	int x2=(int) (w*0.7);
	int y2=(int) (h/2);
	for(int i=0;i<=5;i++)
	{
		Duration d=Duration.of(5,ChronoUnit.SECONDS);
		ta.press(x1,y1).moveTo(x2-x1,y2-y1).waitAction(d).release().perform();
	}

	// Swipe from left to right
	x1=(int) (w*0.7);
	x2=(int) (w*0.9);
	for(int i=0;i<=5;i++)
	{
		Duration d=Duration.of(5,ChronoUnit.SECONDS);
		ta.press(x1,y1).moveTo(x2-x1,y2-y1).waitAction(d).release().perform();
		
	}
}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	// Closeapp
    driver.closeApp();
    // Stop Appium server
    Runtime.getRuntime().exec("taskkill /F /IM node.exe");
    Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");

	}

}
