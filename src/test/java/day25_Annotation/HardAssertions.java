package day25_Annotation;
import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions 
{
		/*	if(s.equals("welcome123"))
		{
			System.out.println("test passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("failed");
			Assert.assertTrue(false);
		}
		*/
		//Assert.assertEquals(s, "welcome");
	//	Assert.assertNotEquals(s,"welcome123");
		
		//Assert.assertTrue(true);
		//Assert.assertTrue(false);
		//Assert.assertFalse(true);
		//Assert.assertFalse(false);
		@Test
		void Test()
		{
			String s="Welcome";
			/*if(s.equals("welcome"))
			{
				System.out.println("test passed");
				Assert.assertTrue(true);
				
			}
			else
			{
				System.out.println("test fail");
				Assert.assertTrue(false);
			}*/
			//Assert.assertEquals(s,"Welcome");
			//Assert.assertNotEquals(s,"welcomee");
			//Assert.assertTrue(true);
			//Assert.assertTrue(false);
			//Assert.assertFalse(true);
			//Assert.assertFalse(false);
			
			Assert.fail();
		}
		
		
		

}

