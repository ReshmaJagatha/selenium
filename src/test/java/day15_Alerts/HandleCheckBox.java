package day15_Alerts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox 
{
	public static void main(String[] args) 
	{	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(" https://testautomationpractice.blogspot.com/");
	
    List<WebElement> gender=driver.findElements(By.xpath("//input[@type='radio' and @class='form-check-input']"));
    System.out.println(gender.size());
    for(int i=0;i<2;i++)
    {
      gender.get(i).click();
    }
	List <WebElement> days= driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
	System.out.println(days.size());
	/*for( WebElement w:days)
	{
		w.click();
	}*/
    for(int i=0;i<=6;i++)
    {
    	days.get(i).click();
    }
	}
}
	
