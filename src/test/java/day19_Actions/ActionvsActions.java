package day19_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.reactivex.rxjava3.functions.Action;
public class ActionvsActions 
{
	public static void main(String[] args) 
	{
       WebDriver driver  = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act=new Actions(driver);
		
		Action act1= (Action) act.contextClick(button).build();
		((Actions) act1).perform();
		
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		
		
		driver.switchTo().alert().accept();

	}
}
