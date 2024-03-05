package Day17_Tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();	
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://jqueryui.com/datepicker/");
	    String month="June";
	    String year="2025";
	    String date="5";
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/07/2023");
	    driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	    while(true)
	    {
	    String m=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	    String y=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	    if(m.equals(month)&& y.equals(year))
	    {
	    	break;
	    }
	    driver.findElement(By.xpath("//a[@title='Next']")).click();
	    }
	    
	    List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	    for( WebElement w :dates)
	    {
	    	if(w.getText().equals(date))
	    	{
	    		w.click();
	    		break;
	    	}
	    }
	}

}
