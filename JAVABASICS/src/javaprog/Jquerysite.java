package javaprog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jquerysite 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\batch239\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://jqueryui.com/");
		
		//Get count of  all text boxes and buttons
		
		List <WebElement> t1=driver.findElements(By.xpath("//*[@type='text']"));
		System.out.println("no: of text boxes in the website are" +t1.size());
		
		List <WebElement> b1=driver.findElements(By.xpath("(//button)|(//input [@type='button'] or [@type='submit']"));

	}

}
