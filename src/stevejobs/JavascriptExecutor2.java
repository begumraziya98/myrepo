package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor2 
{
public static void main(String[] args)
{
	// Open browser 
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	// Launch Site
	driver.get("https://semantic-ui.com/modules/dropdown.html");
	driver.manage().window().maximize();
	// Get invisible items from multiselect drop-down(div) and display invisible element text
	List<WebElement> l=driver.findElements(By.xpath("//*[@class='ui fluid dropdown selection multiple']/div[2]/div"));
	System.out.println(l.size());
    JavascriptExecutor js=(JavascriptExecutor) driver;
    for(int i=0;i<l.size();i++)
    {
    	js.executeScript("var x=arguments[0].textContent;alert(x);",l.get(i));
    	String y=driver.switchTo().alert().getText();
    	System.out.println(y);
    	driver.switchTo().alert().dismiss();
    }
    // Close site
    driver.close();
	}

}
