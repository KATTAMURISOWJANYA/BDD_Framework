package multithreading;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultiThreadex extends Thread
{

		public void run()
		{
			try 
			{
				Thread.sleep(20000);
				
				StringSelection x=new StringSelection("mindq");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(5000);
				
				r.keyPress(KeyEvent.VK_TAB);
				r.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(5000);
				
				StringSelection y=new StringSelection("mindq12");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y, null);
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(5000);
				
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(5000);				
			} 
		catch (Exception e) 
			{

			}
			                                
		}
		
public static void main(String[] args) throws Exception 
	{
	MultiThreadex obj=new MultiThreadex();
	obj.start();
	
	//Launch site
	System.setProperty("webdriver.chrome.driver","F:\\batch239\\Chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://eforms.agility.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	}
}