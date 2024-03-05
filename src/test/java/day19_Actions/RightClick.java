package day19_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver  = new ChromeDriver();
	
	driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	driver.manage().window().maximize();
	
	WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	
	Actions act=new Actions(driver);
	
	act.contextClick(button).perform();
	
	driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
	
	Thread.sleep(2000);
	
	driver.switchTo().alert().accept();
	
}
}
