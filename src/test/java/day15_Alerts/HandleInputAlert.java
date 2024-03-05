package day15_Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleInputAlert {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Welcome");
		
		Thread.sleep(3000);
		alert.accept();
	    String  s=driver.findElement(By.id("result")).getText();
	    if(s.contains("come"))
	    {
	    	System.out.println("test pass");
	    }
	    
	    else
	    {
	    	System.out.println("test fail");
	    }
	    
	  boolean status=driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).isDisplayed();
	  System.out.println(status);
	  System.out.println("the current url is:"+driver.getCurrentUrl());
	  System.out.println("the title is:"+driver.getTitle());
	  System.out.println("the window handle is:"+driver.getWindowHandle());
	  System.out.println("the window handles is:"+driver.getWindowHandles());
	  driver.close();
	}

}
