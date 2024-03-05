package day21_Brokenlinks;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		int brokenlink=0;
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		try {
		for(WebElement link:links) 
		{
			String hvalue=link.getAttribute("href");
			
			if (hvalue==null || hvalue.isEmpty()) 
			{
				
				continue;
			}
			
			URL url=new URL(hvalue);
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			conn.connect();
			
			if(conn.getResponseCode()>=400) 
			{
				System.out.println(url+"========>broken link");
				brokenlink++;
				
			}
			
			else 
			{
				System.out.println(url+"========> not broken link");
			}
				}
		}
		catch(Exception e) {}
		
		System.out.println(brokenlink);
		
		
		
	

	}

}
