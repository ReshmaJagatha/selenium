package OwnPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class ProviderDemo 
{
WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider="dp1")
	void testLogin(String email, String pwd)
	{
		driver.get("https://demo.nopcommerce.com/login");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		String exp_title = "nopCommerce demo store";
		String act_title = driver.getTitle();

		Assert.assertEquals(exp_title, act_title);
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	
	@DataProvider(name="dp1" , indices= {3,4,1})     // 0, 4 are row numbers in array   
	String [][] loginData()
	{
		String data[][]= { 
				{ "abc@gmail.com", "test123" }, 
				{ "akhilsadineni99@gmail.com", "akhil@123S" },
				{ "pavanoltraining@gmail.com", "test3" },
				{ "pavanoltraining@gmail.com", "test@123" },
				{ "pavanoltraining@gmail.com", "test@123" } 
			 };
		return data;
	}
	
	
}
