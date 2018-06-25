package stevejobs;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Angularjs 
{
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a value");
    String x=sc.nextLine();
	// Open Browser
	System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	// Launch Site
	driver.get("https://angularjs.org/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@ng-model='yourName']")).sendKeys(x);
	String y=driver.findElement(By.xpath("(//*[contains(text(),'as we build this app')])[1]/preceding::*[1]")).getText();
	if(y.contains(x))
	{
	System.out.println("Test Passed");

	}
	else
	{
		System.out.println("Test Failed");
	}
}


}
