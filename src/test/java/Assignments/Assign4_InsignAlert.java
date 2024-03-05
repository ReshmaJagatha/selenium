package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign4_InsignAlert
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
driver.findElement(By.xpath("//input[@title='Sign in']")).click();
Thread.sleep(3000);
driver.switchTo().alert().accept();

}
}
