package Day24_TestNG;

import org.testng.annotations.Test;

public class First_Testcase 
{
	@Test(priority=1)
	void openapp()
	{
	System.out.println("Opening application...");	
	}
    @Test(priority=2)
	void login()
	{
		System.out.println("login method....");
	}
    @Test(priority=3)
	
	void logout()
	{
		System.out.println("logout method");
	}
}
