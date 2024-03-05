package day16_Frames;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapMultiselectDropdown 
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		
		List<WebElement> drpdwn=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		
		System.out.println(drpdwn.size());
		
		for(WebElement ele:drpdwn) 
		{
			//System.out.println(ele.getText());
			
			String text=ele.getText();
			
			if (text.equals("Java")||(text.equals("Oracle"))) 
			{
				ele.click();
			}
		}
		
		
		/*for(int i =0;i<drpdwn.size();i++)
			
		{
			drpdwn.get(i).click();
			
		}*/


	   
			
				
	}
}

