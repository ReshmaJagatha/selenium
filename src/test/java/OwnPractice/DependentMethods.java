package OwnPractice;
import org.testng.Assert;
import org.testng.annotations.*;
public class DependentMethods 
{
	
@Test(priority=1)
public void openURL()
{
	Assert.assertTrue(false);
}

@Test(priority=2,dependsOnMethods={"openURL"})
public void Login()
{
	System.out.println("Login method");
}



@Test(priority=3,dependsOnMethods={"openURL","Login"})
public void Search()
{
System.out.println("Search method");	
}
	
@Test(priority=4,dependsOnMethods= {"openURL","Login"})
public void advancedSearch()
{
	System.out.println("Advanced search");
}

@Test(priority=5,dependsOnMethods= {"openURL","Login"})
public void Logout()
{
	System.out.println("Logout method");
}
}
