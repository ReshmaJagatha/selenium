package day25_Annotation;
import org.testng.annotations.*;
public class Class2 
{
	@Test
	void m1()
	{
		System.out.println("this method from class2");
	}
	@BeforeSuite
	void bt()
	{
		System.out.println("this is before test");
	}
}
