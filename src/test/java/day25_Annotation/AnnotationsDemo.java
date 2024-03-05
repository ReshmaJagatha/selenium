package day25_Annotation;
import org.testng.annotations.*;
public class AnnotationsDemo
{
  
	
	@BeforeMethod
	void login()
	{
		System.out.println("login method");
	}
	@Test
	void search()
	{
		System.out.println("search method");
	}
	@Test(priority=1)
	void advancedsearch()
	{
		System.out.println("advancedsearch method");
	}
	@AfterMethod
	void logout()
	{
		System.out.println("logout method");
	}
}
