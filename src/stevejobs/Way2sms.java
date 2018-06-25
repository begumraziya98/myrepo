package stevejobs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Way2sms 
{
public static void main(String[] args) throws InterruptedException 
{
		//Open Browser
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	// Launch Site
	driver.get("http://site21.way2sms.com/jsp/UserRegistration.jsp");
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	// Automating Registration Page 
	driver.findElement(By.xpath("//*[@id='female']/i")).click();
	driver.findElement(By.name("name")).sendKeys("Raziya Begum");
	driver.findElement(By.name("dob")).sendKeys("11/11/1995");
	driver.findElement(By.name("email")).sendKeys("begumraziya98@gmail.com");
	driver.findElement(By.name("cemail")).sendKeys("begumraziya98@gmail.com");
	WebElement e1=driver.findElement(By.name("city"));
	Select s=new Select(e1);
	s.selectByVisibleText("Hyderabad");
   driver.findElement(By.name("mno1")).sendKeys("7032675435");
   driver.findElement(By.xpath("//*[@id='terms']/b")).click();
   driver.findElement(By.xpath("//*[@type='button']")).click();
    // As a Tester we cannot captcha because developers will develop captcha element before release to client :
    // To secure client details ;;As a Tester we cannot captcha ,OTP,Session Expiredand Question and ANSWERS 
	

	}

}
