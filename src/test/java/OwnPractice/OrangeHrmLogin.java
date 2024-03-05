package OwnPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrmLogin 
{
WebDriver driver;
@Test(priority=1)
public void openuRL() 
{
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
@Test(priority=2)
public void validation() 
{
boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
System.out.println(status);
}
@Test(priority=3)
public void Login()
{
driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");
driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
}

@Test(priority=4)
public void Logout() 
{
driver.close();	
}



}
