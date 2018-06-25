package stevejobs;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage2
{
public static void main(String[] args) 
{
	     // Open browser
		System.setProperty("webdriver.chrome.driver","E:\\raziya238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		// Launch Site
		driver.get("https://www.gmail.com");
		// Maximize
		driver.manage().window().maximize();
		// Get size
		int w=driver.manage().window().getSize().getWidth();
		int h=driver.manage().window().getSize().getHeight();
		System.out.println(w+" "+h);
		// Set Size
		Dimension d=new Dimension(500,600);
		driver.manage().window().setSize(d);
		// Get Position
		int x=driver.manage().window().getPosition().getX();
		int y=driver.manage().window().getPosition().getY();
		System.out.println(x+" "+y);
		// Set Position
		Point p=new Point(300,300);
		driver.manage().window().setPosition(p);
		// Close Site
		driver.close();
		

	}

}
