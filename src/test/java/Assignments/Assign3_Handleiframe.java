package Assignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3_Handleiframe {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://ui.vision/demo/webtest/frames/");
	WebElement frame1= driver.findElement(By.xpath("/html[1]/frameset[1]/frame[1] "));
	driver.switchTo().frame(frame1);
	driver.findElement(By.name("mytext1")).sendKeys("welcome to iframe");
	driver.switchTo().defaultContent();
	
	
	//WebElement frame2=
	
	driver.switchTo().frame(driver.findElement(By.xpath("//frameset//frameset//frame[1]")));
	driver.findElement(By.name("mytext2")).sendKeys("hii how r u");
    driver.switchTo().defaultContent();
	
	WebElement frame4=driver.findElement(By.cssSelector("frame[src='frame_4.html']"));
	driver.switchTo().frame(frame4);
	driver.findElement(By.name("mytext4")).sendKeys("Welcome");
	driver.switchTo().defaultContent();
	
	WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame(frame3);
	driver.findElement(By.name("mytext3")).sendKeys("Testing");
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//div[@class=' rseUEf nQOrEb']")).click();
		
		
		
		
	}

}
