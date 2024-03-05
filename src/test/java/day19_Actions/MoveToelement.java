package day19_Actions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToelement 
{
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.opencart.com/index.php?route=cms/demo");
	
	
	Actions act=new Actions(driver);
	
	WebElement link=driver.findElement(By.xpath("//a[@class='btn btn-link navbar-btn']"));
	
	//act.moveToElement(link).build().perform();
	act.moveToElement(link).perform();
	
	}
}
