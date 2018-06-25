package stevejobs;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class App10 
{
public static void main(String[] args) throws Exception
{
		//Start Appium Server
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
	// Goto Home
	try
	{
	driver.pressKeyCode(AndroidKeyCode.HOME);
	// Get appium sever address
	 String x=driver.getRemoteAddress().getPath();
	 System.out.println(x);
	 String y=driver.getRemoteAddress().getProtocol();
	 System.out.println(y);
     int z=	driver.getRemoteAddress().getPort();
     System.out.println(z);
     String h=driver.getRemoteAddress().getHost();
     System.out.println(h);
     long w=driver.getDisplayDensity();
     System.out.println(w);
     String t=driver.getDeviceTime();
     System.out.println(t);
     String p=driver.getPlatformName();
     System.out.println(p);
     // Get Version of Android in device
    //if(driver.isAppInstalled("com.android.settings"))
    //{
    	 //Activity a=new Activity("com.android.settings","com.android.settings.Settings");
    	 //driver.startActivity(a);
    //}
     // Open Notifications
     driver.openNotifications();
     driver.findElement(By.xpath("//*[@content-desc='Open settings']")).click();
     WebDriverWait wait=new WebDriverWait(driver,100);
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='About phone']")));
     driver.findElement(By.xpath("//*[@text='About phone']")).click();
     
     driver.findElement(By.xpath("//*[@text='Software information']")).click();
    
    String v=driver.findElement(By.xpath("//*[@bounds='[63,284][143,330]']")).getAttribute("text");
      System.out.println(v);
      driver.pressKeyCode(AndroidKeyCode.HOME);
      driver.launchApp();
      driver.closeApp();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
      // Stop Appium-server
      Runtime.getRuntime().exec("taskkill /F /IM node.exe");
      Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
      





	}

}
