package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor1
{
public static void main(String[] args)
{
	//Open browser
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	// Launch Site
	driver.get("https://www.gmail.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	// Do Login
	WebElement e=driver.findElement(By.name("identifier"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	// Send data to an element using JavascriptExecutor
	js.executeScript("arguments[0].value='begumraziya98';",e);
    WebElement e1=driver.findElement(By.id("identifierNext"));
	// Click an element using JavascriptExecutor
	js.executeScript("arguments[0].click();",e1);
	WebElement e2=driver.findElement(By.name("password"));
	js.executeScript("arguments[0].value='rameeza98';",e2);
	// HighLight an element using JavascriptExecutor
	js.executeScript("arguments[0].style.border='2px dotted blue';",e2);
	WebElement e3=driver.findElement(By.id("passwordNext"));
	js.executeScript("arguments[0].click();",e3);
	// Close Site
	driver.close();
	

	}

}
