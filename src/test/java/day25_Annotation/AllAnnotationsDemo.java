package day25_Annotation;
import org.testng.annotations.*;

public class AllAnnotationsDemo 
{
	@BeforeSuite//
	void Bs()
	{
	System.out.println("before suite");	
	}
	@AfterSuite
	void As()
	{
	System.out.println("after suite");	
	}
	@BeforeTest//
	void Bt()
	{
		System.out.println("before test");
	}
	@AfterTest
	void At() 
	{
		System.out.println("after test");
	}
	
	@BeforeClass//
    void Bc()
    {
    System.out.println("before class");	
    }
	@AfterClass
    void Ac()
    {
    	System.out.println("after class");
    }
	
	@BeforeMethod//
	void Bm()
	{
	System.out.println("before method");	
	}
	@AfterMethod
	void Am()
	{
		System.out.println("after method");
	}
	
	@Test(priority=1)
	void tm1()
	{
		System.out.println("this is method1");
	}
	
	@Test(priority=2)
	void tm2()
	{
		System.out.println("this is method2");
	}
	
}
