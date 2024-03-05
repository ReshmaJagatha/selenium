package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		WebElement country= driver.findElement(By.xpath("//select[@id='country-list']"));
		Select s=new Select(country);
		s.selectByIndex(2);
		List<WebElement> list= s.getOptions();
		System.out.println(list);
		for(WebElement w:list)
		{
		w.click();
		}
		Thread.sleep(3000);
		WebElement state=driver.findElement(By.xpath("//select[@id='state-list']"));
		Select s1=new Select(state);
		
		
		List<WebElement> list1=s1.getOptions();
		System.out.println(list1);
        for(WebElement w1:list1)
        {
        w1.getText();	
        }
	}

}
