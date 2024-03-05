package OwnPractice;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class AssertionString
{
WebDriver driver;
@Test
public void Test()
{
	String s="welcome";
   /*	if(s.equals("welcome"))
	{
		System.out.println("test passed");
	}*/
	//Assert.assertEquals(s,"welcome");
	Assert.assertTrue(true);
}
}
