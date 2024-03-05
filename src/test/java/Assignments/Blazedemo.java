package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Blazedemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		WebElement list=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select s=new Select(list);
		s.selectByIndex(1);
		
		WebElement li=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select s1=new Select(li);
		
		s1.selectByIndex(5);
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).click();
		
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Reshma");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("SR.nagar");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("telangana");
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("533216");
		WebElement drop=driver.findElement(By.xpath("//select[@id='cardType']"));
		Select se=new Select(drop);
		se.selectByIndex(1);
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("789654");
		driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("11");
		driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2024");
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Reshma Jagatha");
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
	}

}
