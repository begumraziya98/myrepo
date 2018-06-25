package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavascriptExecutor4 
{
public static void main(String[] args) throws InterruptedException 
{
	// Open Browser
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	// Launch Site
	driver.get("https://semantic-ui.com/modules/dropdown.html");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	// Scroll from top to bottom
	js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	// Scroll from bottom to top
	js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
	// Scroll to Specific Element
	WebElement e=driver.findElement(By.xpath("//*[@class='ui fluid dropdown selection multiple']"));
    js.executeScript("arguments[0].scrollIntoView();",e);
    // Close Site
    driver.close();
    
	}

}
