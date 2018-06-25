package stevejobs;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Popup2
{
public static void main(String[] args) throws Exception  
{
	//Open browser(SWD)
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	// Launch site(SWD)
	driver.get("https://www.gmail.com");
	// Wait and maximize(SWD)
	WebDriverWait w=new WebDriverWait(driver,100);
	w.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
	driver.manage().window().maximize();
	// Do login(SWD)
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	driver.findElement(By.name("identifier")).sendKeys("begumraziya98@gmail.com");
	driver.findElement(By.id("identifierNext")).click();
	w.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	driver.findElement(By.name("password")).sendKeys("rameeza98");
    driver.findElement(By.id("passwordNext")).click();
    // Click Compose(SWD)
	driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
	// Fill fields(SWD)
	driver.findElement(By.name("to")).sendKeys("apj@abdulkalam.com");
	driver.findElement(By.name("subjectbox")).sendKeys("Promise");
	driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("Hi Sir\nHow r you sir in heaven\ni am a good tester");
    // Click Attachment(SWD) 
	driver.findElement(By.xpath("//*[@aria-label='Attach files']")).click();
	// Handle File upload window(Java Robot)
	StringSelection x=new StringSelection("C:\\Users\\Raziya Begum\\Pictures\\Saved Pictures\\tulips.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x,null);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    // Send Mail(SWD)
    driver.findElement(By.xpath("//*[text()='Send']")).click();
    // Wait and get message
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Your message has been sent')]")));
    String m=driver.findElement(By.xpath("//*[contains(text(),'Your message has been sent')]")).getText();
    System.out.println(m);
	// Do Logout
    driver.findElement(By.xpath("//*[contains(@title,'Google Account')]")).click();
    driver.findElement(By.linkText("Sign out")).click();
    //Close Site
    driver.close();
}

}
