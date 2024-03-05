package Assignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1_title 
{
  public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(3000);
	driver.get(" https://www.saucedemo.com/ ");
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	driver.findElement(By.xpath(" //input[@id='login-button']")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("react-burger-menu-btn")).click();

    driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
	driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack'] ")).click();
	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click(); 
	String s1= driver.getTitle();
	String s2="Swag Labs";
	if(s1.equals(s2))
	{
		System.out.println("title is there");
		
	}
	else
	{
		System.out.println("title is not matching");
	}
	
	System.out.println(driver.getWindowHandle());
	

	}
		
		
	}

	
	
	

