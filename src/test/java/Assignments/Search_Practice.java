package Assignments;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Practice
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.findElement(By.xpath(" //input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("java");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(3000);
    List<WebElement> li=driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']//a"));
    System.out.println(li.size());
    for(WebElement w:li)
    	
    {
    	System.out.println(w.getText());
    	w.click();
    }
    
    Set<String> ids=driver.getWindowHandles();
    for(String st:ids)
    {
    String str=driver.switchTo().window(st).getTitle();
    System.out.println(str);
    if(str.equals("Java version history - Wikipedia"))
    {
    driver.close();
    }
    }
    
    
    		
    	           
    			
        
    
    
}
}
