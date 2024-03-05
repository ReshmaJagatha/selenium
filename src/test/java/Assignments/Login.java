package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login 
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	WebElement U=driver.findElement(By.name("username"));
	U.sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	Thread.sleep(3000);
	String s1= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	String s2="Dashboard";

	if(s1.equals(s2))
	{
		System.out.println("Returns true");
	}
	else
	{
		System.out.println("Returns false");
	}
	  String s3=driver.getTitle();
	  String s4="OrangeHRM";
	  
	  if(s3.equals(s4))
	  {
	  	System.out.println(" true");
	  	driver.close();
	  }
	  else
	  {
	  	System.out.println(" false");
	  }
	  
	}
}
