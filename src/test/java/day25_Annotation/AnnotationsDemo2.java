package day25_Annotation;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationsDemo2 
{
	@BeforeClass
	void login() 
	{
		System.out.println("login method");
	}
	
	@Test()
	void search() 
	{
		System.out.println("search method");
	}
	
	@Test(priority=1)
	void advanced()
	{
		System.out.println("advanced search method");
	}
	

	@AfterClass
	void logout() 
	{
		System.out.println("logout method");
	}
}
