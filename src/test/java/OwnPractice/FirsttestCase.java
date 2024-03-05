package OwnPractice;

import org.testng.annotations.Test;

public class FirsttestCase
{
@Test(priority=1)
public void Login()
{
	System.out.println("Login method");
}
@Test(priority=2)
public void Logout() {
	System.out.println("Logout Method");
}
@Test(priority=3)
public void Click()
{
	System.out.println("Click method");
}
}
