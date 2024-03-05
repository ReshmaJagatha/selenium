package OwnPractice;
import org.testng.annotations.*;

public class Annotation_BeforeMethod 
{
@BeforeMethod
public void Login()
{
	System.out.println("Login method");
}
@Test
public void Logout()
{
	System.out.println("Logout method");
}
@Test(priority=1)
public void log()
{
	System.out.println("log method");
}
@AfterMethod
public void click()
{
	System.out.println("Click method");
}
}
//output..login,logout,login,log,click