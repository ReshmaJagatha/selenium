package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownWithoutSelect 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	
	driver.findElement(By.xpath("//select[@id='country-list']")).click();
	List<WebElement> list=driver.findElements(By.xpath("//select[@id='country-list']/option"));
	System.out.println(list.size());
	String s="India";
	for(WebElement li:list)
	{
	
	if(li.getText().equals(s))
	{
		li.click();
		System.out.println(li.getText());
	}
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//select[@id='state-list']")).click();
	
    List<WebElement> state=driver.findElements(By.xpath("//select[@name='state']/option"));
   
    System.out.println(state.size());
    String sd="Delhi";
    for(WebElement w :state)
    {
    	System.out.println(w.getText());
    	if(w.getText().equals(sd))
    	{
    		w.click();
    	}
    }
    
}
}
