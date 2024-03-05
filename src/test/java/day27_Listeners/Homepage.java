package day27_Listeners;
import org.testng.annotations.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Homepage 
{
	WebDriver driver;
	
	@BeforeClass
void setup() 
{
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	
}

@Test(priority=1)
void logo() throws InterruptedException 
{
	Thread.sleep(3000);
    boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	
	Assert.assertEquals(status, true);
}

@Test(priority=2)
void title() 
{
	Assert.assertEquals(driver.getTitle(), "OrangeHRM123");
	
}

@Test(priority=3 ,dependsOnMethods="title")
void appurl() 
{
	Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@AfterClass
void teardown()
{
	driver.close();
}
}
