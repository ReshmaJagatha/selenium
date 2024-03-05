package day16_Frames;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleFrames 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();	
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
/*driver.get("https://ui.vision/demo/webtest/frames/");
WebElement frame1=driver.findElement(By.xpath("//frameset//frameset//frame[1]"));
driver.switchTo().frame(frame1);
driver.findElement(By.xpath(" //input[@name='mytext1']")).sendKeys("hello");
driver.switchTo().defaultContent();


WebElement frame3=driver.findElement(By.xpath("//div[normalize-space()='Frame3']"));
driver.switchTo().frame(frame3);driver.findElement(By.xpath(" //input[@name='mytext3']")).sendKeys("Welcome");
driver.switchTo().frame(0);
driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();*/
driver.get(" https://ui.vision/demo/webtest/frames/");

WebElement frame1=driver.findElement(By.xpath("/html[1]/frameset[1]/frame[1]"));
driver.switchTo().frame(frame1);
driver.findElement(By.name("mytext1")).sendKeys("hello");
driver.switchTo().defaultContent();

WebElement frame3= driver.findElement(By.cssSelector("frame[src='frame_3.html']"));
//WebElement frame3=driver.findElement(By.xpath("//frameset//frameset//frame[1]"));
driver.switchTo().frame(frame3);
driver.findElement(By.name("mytext3")).sendKeys("Welcome");
driver.switchTo().frame(0);
driver.findElement(By.xpath("//div[@class=' rseUEf nQOrEb']")).click();
}
}
