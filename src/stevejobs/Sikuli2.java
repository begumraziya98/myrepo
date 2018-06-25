package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Sikuli2 
{
public static void main(String[] args) throws Exception 
{
	// Launch Site(SWD)
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	// Search for a video
	driver.findElement(By.name("search_query")).sendKeys(" abdul kalam sir speech");
	driver.findElement(By.xpath("(//*[@aria-label='Search'])[3]/child::*[1]")).click();
	driver.findElement(By.linkText("Dr. A P J Abdul Kalam in European Parliament")).click();
   // Video automation(Sikulix)
	Screen s=new Screen();
	if(s.exists("skipadd.png")!=null)
	{
		s.click("Skipadd.png");
	}
	// Mouve mouse pointer to video play
	 
	}

}
