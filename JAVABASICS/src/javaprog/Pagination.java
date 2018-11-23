package javaprog;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pagination 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String x=sc.nextLine();
		int count=1;

		
		//launch site
		System.setProperty("webdriver.chrome.driver","F:\\batch239\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		driver.manage().window().maximize();
		
		//send data to text box
		driver.findElement(By.name("q")).sendKeys("kalam",Keys.ENTER);
		while(2>1)
		{
			try
			{
			
				if (driver.findElement(By.xpath("//*[text()='Next']")).isDisplayed())
					{
						driver.findElement(By.xpath("//*[text()='Next']")).click();
						count=count+1;
					}
				
			}
			catch(Exception ex) 
			{
				break;
			}
		}
		System.out.println(count);	
		driver.close();
	}
}
	