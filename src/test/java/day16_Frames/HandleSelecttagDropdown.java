package day16_Frames;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelecttagDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	    WebElement c= driver.findElement(By.xpath("//select[@id='country-list']"));
		Select s=new Select(c);
		//s.selectByVisibleText("India");
		s.selectByIndex(2);
		List<WebElement> l=s.getOptions();
		System.out.println(l.size());
		for(WebElement w:l)
		{
			System.out.println(w.getText());
		}
		Thread.sleep(3000);
		WebElement state=driver.findElement(By.xpath("//select[@id='state-list']"));
		Select s1=new Select(state);
		s1.selectByVisibleText("Hebei");
		List<WebElement>l1= s1.getOptions();
		System.out.println(l1);
		for(WebElement st:l1)
		{
			System.out.println(st.getText());
		}
	}

}
