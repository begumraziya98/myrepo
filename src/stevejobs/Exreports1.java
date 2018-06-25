package stevejobs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Exreports1 
{
public static void main(String[] args) throws Exception 
 {
		// Open a html file for results 
	ExtentReports er=new ExtentReports("googleres.html",false);
	ExtentTest et=er.startTest("Google site title Test");
	// Launch site 
	System.setProperty("webdriver.gecko.driver","E:\\raziya238\\geckodriver.exe");
    FirefoxDriver driver=new FirefoxDriver();
    driver.get("http://www.google.co.in");
    String t=driver.getTitle();
    if(t.equals("google"))
    {
    	File src=driver.getScreenshotAs(OutputType.FILE);
    	File dest=new File("ss1.png");
    	FileUtils.copyFile(src,dest);
    	et.log(LogStatus.PASS,"Title Test was passed"+et.addScreenCapture("ss1.png"));
    }
    else
    {
    	File src=driver.getScreenshotAs(OutputType.FILE);
    	File dest=new File("ss2.png");
    	FileUtils.copyFile(src,dest);
    	et.log(LogStatus.FAIL,"Title Test was failed"+et.addScreenCapture("ss2.png"));
    }
    // Close site 
    driver.close();
    // save html file
    er.endTest(et);
    er.flush();
 }

}
