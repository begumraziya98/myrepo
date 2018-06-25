package stevejobs;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
public class App5 
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
	dc.setCapability("deviceName","emulator-5554");
	dc.setCapability("platformName","android");
	dc.setCapability("platformVersion","4.2.2");
	dc.setCapability("appPackage","com.android.calculator2");
	dc.setCapability("appActivity","com.android.calculator2.Calculator");
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
			String x=driver.getCurrentPackage();
			System.out.println(x);
			String y=driver.currentActivity();
			System.out.println(y);
			// Send app to background for 10 seconds
			Duration d=Duration.of(10,ChronoUnit.SECONDS);
			driver.runAppInBackground(d);
			// Goto Home
			driver.pressKeyCode(AndroidKeyCode.HOME);
			// Activate Calculator
			driver.launchApp();   // Calculator will back to display
            // Operate an element and Reset app	
			driver.findElement(By.xpath("//*[@text='9']")).click();
			driver.resetApp(); // reload calculator app
			driver.closeApp();
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

