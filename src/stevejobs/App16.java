package stevejobs;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
public class App16 
{
public static void main(String[] args) throws Exception
{
	// Start appium server
	Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
	// Get address of appium server
	URL u=new URL("http://0.0.0.0:4723/wd/hub");
	//Provide app and device details
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(CapabilityType.BROWSER_NAME,"");
	dc.setCapability("deviceName","emulaor-5554");
	dc.setCapability("platforName","android");
	dc.setCapability("platformVersion","4.2.2");
	dc.setCapability("appPackage","com.android.deskclock");
	dc.setCapability("appActivity","com.android.deskclock.DeskClock");
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
	// Automate app screen elements in Avd
	try
	{
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@content-desc='Cities']")).click();
	// Perform swipe for required element
	driver.context("NATIVE_APP");
	int w=driver.manage().window().getSize().getWidth();
	int h=driver.manage().window().getSize().getHeight();
	TouchAction ta=new TouchAction(driver);
	// Swipe from bottom to top for required city
	int x1 =(int) (w/2);
	int y1=(int) (h*0.9);
	int x2=(int) (w/2);
	int y2=(int) (h*0.7);
	/*int x=(int) (w/2);
	int y=(int) (h*0.9);
	int temp = (int)(h*0.7);*/
	while(2>1)  // infinite loop
	{
		try
		{
			driver.findElement(By.xpath("//*[@text='Banglore']")).click();
			break;  // terminate from loop
		}
		catch(Exception e)
		{
			ta.press(x1,y1).moveTo(x2-x1,y2-y1).release().perform();
		}
	}
	// Swipe from top to bottom for required city
   /* temp=(int) (h*0.3);
	y=(int) (h*0.1);*/
	y1=(int) (h*0.1);
	y2=(int) (h*0.3);
	
	while(2>1)
	{
		try
		{
			driver.findElement(By.xpath("//*[@text='Amman']")).click();
			break;
		}
		catch(Exception e)
		{
			ta.press(x1,y1).moveTo(x2-x1,y2-y1).release().perform();
		}
	}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	

	
	// Close app
    driver.closeApp();
    // Stop Appium server
    Runtime.getRuntime().exec("taskkill /F /IM node.exe");
    Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	}

}
