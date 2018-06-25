package stevejobs;

import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class App18 
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
	dc.setCapability("appPackage","com.samsung.android.contacts");
	dc.setCapability("appActivity","com.android.dialer.DialtactsActivity");
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
	try
	{
		driver.pressKeyCode(AndroidKeyCode.HOME);
		WebDriverWait w=new WebDriverWait(driver,100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Contacts']")));
		MobileElement e=(MobileElement) driver.findElement(By.xpath("//*[@content-desc='Contacts']"));
		TouchAction ta=new TouchAction(driver);
		Duration d=Duration.of(10,ChronoUnit.SECONDS);
		ta.longPress(e).waitAction(d).release().perform();
		driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"shortcut\")").click();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	// Launch app
	driver.launchApp();
	//Close app
    driver.closeApp();
    // Stop Appium server
    Runtime.getRuntime().exec("taskkill /F /IM node.exe");
    Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	

	}

}
