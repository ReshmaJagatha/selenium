package OwnPractice;
import org.testng.annotations.*;
public class class1 
{
	@Test
	void m() 
	{
		System.out.println("this method from class1");
	}
	
	@BeforeSuite
	void at() 
	{
		System.out.println(" this after test method");
	}
}
