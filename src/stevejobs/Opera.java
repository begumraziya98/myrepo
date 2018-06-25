package stevejobs;

import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;


public class Opera 
{
public static void main(String[] args) 
{
	//Set Binary for opera(Provide Path where opera browser is downloaded)
	OperaOptions op=new OperaOptions();
	op.setBinary("C:\\Program Files\\Opera\\52.0.2871.40\\opera.exe");
	// Run Operadriver.exe to get Opera Browser
	System.setProperty("webdriver.opera.driver","E:\\raziya238\\operadriver_win64\\operadriver.exe");
	// Create Object to get Opera Browser
	OperaDriver driver=new OperaDriver(op);
	// Launch Site
	driver.get("http://www.google.co.in");
	

	}

}
