package day27_Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo 
{
	/*@Test(priority=1)
	void test1() 
	{
		Assert.assertEquals(1, 1);
	}
	
	@Test(priority=2)
	void test2() 
	{
		Assert.assertEquals(1, 2);
	}
	
	
	@Test(priority=3,dependsOnMethods="test2")
	void test3() 
	{
		Assert.assertEquals(1, 1);
	}*/
	@Test(priority=1)
	void test1()
	{
		Assert.assertEquals(1, 1);
	}
	@Test(priority=2)
	void test2()
	{
		Assert.assertEquals(1, 2);
	}
	@Test(priority=3,dependsOnMethods="test2")
	void test3()
	{
		Assert.assertEquals(1, 1);
	}
}
