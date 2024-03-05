package day27_Listeners;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHrmLogin 
{
/*	@Test
	void login() 
	{
		//LoginPage lp=new LoginPage(driver);
		LoginPage2 lp=new LoginPage2(driver);
		
		lp.setusername("Admin");
		lp.setpassword("admin123");
		lp.loginclick();
	}
	
	@AfterClass
	void teardown() 
	{
		driver.close();
	}*/
	
WebDriver driver;
@BeforeClass
void Setup()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
@Test
void login()
{
	Loginpage lp=new Loginpage(driver);
	lp.setusername("Admin");
	lp.setpassword("admin123");
	lp.loginclick();
}
@AfterClass
void tearDown() 
{
driver.close();	
}
}
