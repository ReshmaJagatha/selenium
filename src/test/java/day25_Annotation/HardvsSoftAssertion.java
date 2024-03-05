package day25_Annotation;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class HardvsSoftAssertion 
{
	/*//@Test()
		void testhardassertion() 
		{
			System.out.println("testing...");
			System.out.println("testing...");
			
			Assert.assertEquals(1, 2);
			System.out.println("hard assertion compleated");
			Assert.assertEquals(1, 1);
			
		}*/
		
	/*	@Test()
		void testsoftassertion()
		{
			System.out.println("testing...");
			System.out.println("testing...");
			
			SoftAssert sa=new SoftAssert();
			
			sa.assertEquals(1,2);
			
			System.out.println("soft assertion compleated");
			
			sa.assertEquals(1, 1);
			
			sa.assertAll();  //Mandatory
			
		}*/
		@Test
		void testhardassertion()
		{
			System.out.println("testing");
			System.out.println("testing");
			Assert.assertEquals(1, 2);
			
		}

}
