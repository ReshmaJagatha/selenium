package OwnPractice;
import org.testng.annotations.*;

public class Annotations_BeforeSuite 
{
	@BeforeSuite
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
	@AfterSuite
	public void click()
	{
		System.out.println("Click method");
	}
}
//output..login,logout,log,click
