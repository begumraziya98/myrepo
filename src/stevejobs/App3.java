package stevejobs;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class App3 
{
public static void main(String[] args) throws Exception
{
	// Get data from keyboard 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter input1");
	String x=sc.nextLine();
	System.out.println("Enter input2");
	String y=sc.nextLine();
	// Start appium-server
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
			// Enter input1
			for(int i=0;i<x.length();i++)
			{
				char z=x.charAt(i);
				driver.findElement(By.xpath("//*[@text='"+z+"']")).click();
			}
				// Click +
				driver.findElement(By.xpath("//*[@content-desc='plus']")).click();
				// Enter input2
				for(int i=0;i<y.length();i++)
				{
					char z=y.charAt(i);
					driver.findElement(By.xpath("//*[@text='"+z+"']")).click();
				}
					// Click =
					driver.findElement(By.xpath("//*[@content-desc='equals']")).click();
					// Get output
					String r=driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).getAttribute("text");
					int i1=Integer.parseInt(x);
					int i2=Integer.parseInt(y);
					int o=Integer.parseInt(r);
					if(o==i1+i2)
					{
						System.out.println("Test Passed");
						
					}
					else
					{
						System.out.println("Test failed");
					}
					// Close app 
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


