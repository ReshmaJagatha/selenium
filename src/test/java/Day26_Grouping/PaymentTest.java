package Day26_Grouping;
import org.testng.annotations.Test;
public class PaymentTest 
{
	@Test(priority=1,groups= {"sanity","regression","functional"})
	void paymentindollar()
	{
		System.out.println("payment in dollars form");
	}
	@Test(priority=2,groups= {"sanity"})
	void paymentinRupees()
	{
		
		System.out.println("payment in rupees form");
	}
	
	@Test(priority=3,groups= {"regression"})
	void paymentReturnByBank()
	{
	System.out.println("payment in bank return form");	
	}
}
