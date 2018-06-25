package stevejobs;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
public class NotepadWindow 
{
public static void main(String[] args) throws Exception 
{
	// Launch notepad
	Runtime.getRuntime().exec("notepad.exe");
	Thread.sleep(5000);
	// Get Choose New in File menu
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_F);
	r.keyRelease(KeyEvent.VK_F);
	r.keyRelease(KeyEvent.VK_ALT);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	// Send data to notepad
	StringSelection x=new StringSelection("Abdul Kalam");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x,null);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(5000);
	// Choose save in file menu
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_F);
	r.keyRelease(KeyEvent.VK_F);
	r.keyRelease(KeyEvent.VK_ALT);
	Thread.sleep(5000);
	//r.keyPress(KeyEvent.VK_DOWN);
	//r.keyRelease(KeyEvent.VK_DOWN);
	//r.keyPress(KeyEvent.VK_DOWN);
	//r.keyRelease(KeyEvent.VK_DOWN);
	for(int i=1;i<=2;i++)
	{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	Thread.sleep(5000);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	// Save file with a name
	StringSelection y=new StringSelection("E:\\raziya238\\notepad.txt");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y,null);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	// Close notepad
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_F4);
	r.keyRelease(KeyEvent.VK_F4);
	r.keyRelease(KeyEvent.VK_ALT);
	
	
	}

}
