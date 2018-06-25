package stevejobs;

import java.awt.Robot;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class Sikuli 
{
public static void main(String[] args) throws Exception 
{
		// 
	Screen s=new Screen();
	s.click("minimize.png");
	Thread.sleep(5000);
	s.doubleClick("desktop.png");
	Thread.sleep(5000);
	s.click("chromeminimize.png");
	Thread.sleep(5000);
	s.rightClick("ricdesktop.png");
	Thread.sleep(5000);
	Robot r=new Robot();
	for(int i=1;i<=3;i++)
	{
		s.type(Key.DOWN);
		Thread.sleep(5000);
	}
	s.type(Key.ENTER);
	
	
	

	}

}
