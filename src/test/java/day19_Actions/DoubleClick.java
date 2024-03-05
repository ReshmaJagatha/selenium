package day19_Actions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	driver.manage().window().maximize();
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
	
	WebElement f1=driver.findElement(By.id("field1"));
	WebElement f2=driver.findElement(By.id("field2"));
	
	WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	f1.clear();
	f1.sendKeys("welcome");
	
	Actions act=new Actions(driver);
	
	act.doubleClick(button).perform();
	
	if(f2.getAttribute("value").equals("welcome")) 
	{
		System.out.println("text copied");
		
	}
	else 
	{
		System.out.println("text not copied");
	}
	
	
	
	
}
}
