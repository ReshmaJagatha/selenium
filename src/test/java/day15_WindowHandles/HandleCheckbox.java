package day15_WindowHandles;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> weekno= driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
		System.out.println(weekno.size());
	/*	for(int i=0;i<weekno.size();i++)
		{
			weekno.get(i).click();
		}*/
	/*	for(WebElement w: weekno)
		{
			w.click();
		}*/
	/*	for(int i=5;i<weekno.size();i++)
		{
			weekno.get(i).click();
		}
		*/
		for(int i=0;i<3;i++)
		{
			weekno.get(0).click();
		}
		
		for(WebElement w:weekno)
		{
			if(w.isSelected()!=true)
			{
				w.click();
			}
		}

	}

}
