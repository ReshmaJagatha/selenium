package day27_Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage 
{
WebDriver driver;

 public Loginpage(WebDriver driver)
 {
	this.driver=driver; 
 }
    By txt_username=By.xpath("//input[@placeholder='Username']");
	By txt_password=By.xpath("//input[@placeholder='Password']");
	By btn_login=By.xpath("//button[normalize-space()='Login']");
	
	public void setusername(String user)
	{
		driver.findElement(txt_username).sendKeys(user);
	}
	public void setpassword(String pwd)
	{
		driver.findElement(txt_password).sendKeys(pwd);
	}
	public void loginclick()
	{
		driver.findElement(btn_login).click();
	}
	
	
	
	
	
	
	
	
	
	
}
