package Day26_Grouping;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo 
{
	WebDriver driver;
	@BeforeClass
	void SetUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Test(dataProvider="dp1")
    void TestLogin(String email,String pwd)
    {
    driver.get("https://demo.nopcommerce.com/login");	
    driver.findElement(By.id("Email")).sendKeys(email);
    driver.findElement(By.id("Password")).sendKeys(pwd);
    driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
    String Exp_title="nopCommerce demo store. Login";
    String Act_title=driver.getTitle();
    Assert.assertEquals(Exp_title, Act_title);
    }
	@AfterClass
	void TearDown()
	{
		driver.close();
	}
	@DataProvider(name="dp1")
    String[][] loginData()
    {
    	String data[][]= {
    			{ "abc@gmail.com", "test123" }, 
				{ "jagatha.reshma@gmail.com", "234779!@#" },
				{ "reshma123@gmail.com", "test3" },
				{ "reshu@gmail.com", "test@123" },
				{ "xyz@gmail.com", "test@123" } 
			 };
    	return data;
    	}
    }

