package Day26_Grouping;
import org.testng.annotations.Test;
public class LoginTest 
{
	@Test(priority=1,groups= {"sanity","regression","functional"})
	void loginbyEmail()
	{
		System.out.println("login by gmail");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginByfacebook()
	{
	System.out.println("login by facebook");	
	}
	
	@Test(priority=3,groups= {"sanity"})
	void loginBytwitter()
	{
	System.out.println("login By twitter");	
	}
}
