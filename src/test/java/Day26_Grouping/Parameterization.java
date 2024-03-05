package Day26_Grouping;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Parameterization 
{

	WebDriver driver;
	
	@BeforeClass
	//@Parameter({"browser"})
	void setup(String br,String appurl)
	{
		if(br.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(appurl);
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	void logo() throws InterruptedException
	{
	Thread.sleep(3000);
	boolean  status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	Assert.assertEquals(status, true);
	}
	@Test(priority=2)
	void title()
	{
	Assert.assertEquals(driver.getTitle(), "OrangeHRM");	
	}
	@Test(priority=3)
	void appurl()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@AfterClass
	void tearDown()
	{
		driver.close();
	}

}
