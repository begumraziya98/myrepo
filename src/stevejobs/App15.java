package stevejobs;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.util.LoadLibs;

public class App15 
{
public static void main(String[] args) throws Exception
{
	//Start Appium Server
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
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@text='RECENTS']")).click();
	driver.findElement(By.xpath("(//*[@class='android.view.ViewGroup'])[1]")).click();
    driver.findElement(By.xpath("//*[@text='Call']")).click();
    WebDriverWait w=new WebDriverWait(driver,100);
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='End call']")));
    File src=driver.getScreenshotAs(OutputType.FILE);  // Taken screenshot
    File dest=new File("E:\\raziya238\\s.png");  // Stored in RAM
    FileUtils.copyFile(src,dest);   // From RAM Stored into HardDiskDrive
    driver.findElement(By.xpath("//*[@content-desc='End call']")).click();
    // Apply OCR technique to get text in Screenshot image
    File f=new File("E:\\raziya238\\s.png");
    File fo=LoadLibs.extractTessResources("tessdata"); // My tes4j dont know where is english charaters, so loading english charaters folders in fo file
    Tesseract obj=new Tesseract();
    obj.setDatapath(fo.getAbsolutePath());
    Thread.sleep(20000);
    String result=obj.doOCR(f);
    System.out.println(result);
    // Validate toasted message
    if(result.contains("Conditional call"))
    {
    	System.out.println("Test Passed");
    }
    else
    {
    	System.out.println("Test failed");
    }
    // Closeapp
    driver.closeApp();
    // Stop Appium server
    Runtime.getRuntime().exec("taskkill /F /IM node.exe");
    Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
    
	

	}

}
