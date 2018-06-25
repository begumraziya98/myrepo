package stevejobs;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CalcWindow 
{
public static void main(String[] args) throws Exception 
{
	// Open Calculator
	Runtime.getRuntime().exec("calc.exe");
	Thread.sleep(5000);
	// Enter input1
	StringSelection x=new StringSelection("1234");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x,null);// null-x is Pure data don't add any flavours to clipboard
	Thread.sleep(5000);
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_CONTROL);
    Thread.sleep(5000);
    // Click +
    r.keyPress(KeyEvent.VK_ADD);
    r.keyRelease(KeyEvent.VK_ADD);
    // Enter input2
    StringSelection y=new StringSelection("6789");
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y,null);
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_CONTROL);
    // Click =
    r.keyPress(KeyEvent.VK_EQUALS);
    r.keyRelease(KeyEvent.VK_EQUALS);
    // Get Output and Display
    r.keyPress(KeyEvent.VK_CONTEXT_MENU);
    r.keyRelease(KeyEvent.VK_CONTEXT_MENU);
    Thread.sleep(5000);
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    Thread.sleep(5000);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(5000);
    String z=(String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
    System.out.println(z);
    // Close Calculator
    r.keyPress(KeyEvent.VK_ALT);
    r.keyPress(KeyEvent.VK_F4);
    r.keyRelease(KeyEvent.VK_F4);
    r.keyRelease(KeyEvent.VK_ALT);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
    
    
   
   
    
    
	}

}
