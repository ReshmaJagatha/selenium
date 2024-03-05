package OwnPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class Annotations_Beforeclass 
{
	@BeforeClass
	public void Login()
	{
		System.out.println("Login method");
	}
	@Test
	public void Logout()
	{
		System.out.println("Logout method");
	}
	@Test(priority=1)
	public void log()
	{
		System.out.println("log method");
	}
	@AfterClass
	public void click()
	{
		System.out.println("Click method");
	}
}
//output..login,logout,log,click
