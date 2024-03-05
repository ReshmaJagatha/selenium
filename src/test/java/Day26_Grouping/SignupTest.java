package Day26_Grouping;
import org.testng.annotations.Test;
public class SignupTest 
{
	@Test(priority=1,groups= {"sanity","regression","functional"})
	void loginByEmail()
	{
		System.out.println("login using gmail");
	}
	
	@Test(priority=2,groups= {"regression"})
	void loginByFacebook()
	{
		System.out.println("login using facebook");
	}
	
	@Test(priority=3,groups= {"regression"})
	void loginByTwitter()
	{
		System.out.println("login using twitter");
	}
}
