package day25_Annotation;
import org.testng.annotations.Test;
import org.testng.Assert;
public class DependentMethod 
{
	/*@Test(priority=1)
	void openapp() 
	{
			Assert.assertTrue(false);
		
	}
	
	@Test(priority=2,dependsOnMethods= {"openapp"})
	void login()
	{
		System.out.println("login app");
	}

	@Test(priority=3,dependsOnMethods= {"openapp","login"} )
	void search()
	{
		System.out.println("search box");
	}
	
	@Test(priority=4,dependsOnMethods= {"openapp","login"})
	void advancedsearch()
	{
		System.out.println("advanced search");
	}
	@Test(priority=5,dependsOnMethods= {"openapp","login"})
	void logout()
	{
		System.out.println("logout");
	}*/
	
	@Test(priority=1)
	void openapp()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=2,dependsOnMethods= {"openapp"})
	void login()
	{
		System.out.println("login app");
	}
	@Test(priority=3,dependsOnMethods= {"openapp","login"})
	void search()
	
	{
	System.out.println(" search method");	
	}
	@Test(priority=4,dependsOnMethods= {"openapp","login"})
	void advancedsearch()
	{
		System.out.println("advanced search");
	}
	@Test(priority=5,dependsOnMethods= {"openapp","login"})
	void logout()
	{
	System.out.println("logout method");	
	}
}
