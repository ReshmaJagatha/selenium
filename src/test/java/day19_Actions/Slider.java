package day19_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Slider 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		driver.manage().window().maximize();
		
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		
		Actions act=new Actions(driver);
		System.out.println(min_slider.getLocation());
		
		act.dragAndDropBy(min_slider, 100, 249).perform();
		
		System.out.println(min_slider.getLocation());
		
		

		System.out.println(max_slider.getLocation());
		
		act.dragAndDropBy(max_slider, -100, 249).perform();
		
		System.out.println(max_slider.getLocation());
		
	}

}
