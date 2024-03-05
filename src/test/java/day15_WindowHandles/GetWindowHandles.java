package day15_WindowHandles;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" );
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
	Set<String> s=driver.getWindowHandles();
	
	List<String> l=new ArrayList(s);
    String s1=l.get(0);
	String s2=l.get(1);
	driver.switchTo().window(s2);
	Thread.sleep(3000);
	//driver.close();
	driver.switchTo().window(s1);
    System.out.println(driver.getTitle());
    
    for(String id  :s)
    {
     String title= driver.switchTo().window(id).getTitle();	
     if(title.equals("OrangeHRM"))
     {
    	 driver.findElement(By.name("username")).sendKeys("Admin");
    	 driver.findElement(By.name("password")).sendKeys("admin123");
    	 driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
     }
     else if(title.equals(" OrangeHRM HR Software | OrangeHRM"))
     {
    	 driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
     }
    }

	}

}
