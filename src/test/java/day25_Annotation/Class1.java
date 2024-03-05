package day25_Annotation;
import org.testng.annotations.*;
public class Class1
{
	
	@Test
	void m() 
	{
	System.out.println("this method from class1");	
	}
	@AfterSuite
	void at()
	{
		System.out.println("this after test method");
	}
}
