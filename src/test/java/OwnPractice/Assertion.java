package OwnPractice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion 
{
WebDriver driver=new ChromeDriver();
@Test(priority=1)
public void openurl()
{
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
@Test(priority=2)
public void validate()
{
boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
Assert.assertEquals(true,status);
}



}
