package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Static 
{
	public static void main(String[] args) 
	{	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://testautomationpractice.blogspot.com");
    
    int row=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
    System.out.println(row);
    
    int col=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
    System.out.println(col);
    
    WebElement data=driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[2]"));
    System.out.println(data.getText());
    
    WebElement data1=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[4]"));
    System.out.println(data1.getText());
    
    for(int r=1;r<=row;r++)
    {
    	for(int c=1;c<=col;c++)
    	{
    	String s1=driver.findElement(By.xpath("//table[@name='BookTable']//tr[\"+l+\"]//td[\"+j+\"]")).getText();
    	System.out.print(s1+" ");
    	}
    	System.out.println();
    }
    for(int r=2;r<=row;r++)
    {
    String name=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
    if(name.equals("Mukesh"))
    {
    String book=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
    System.out.println(book);
    }
	}
    int i=0;
    for(int r=2;r<=row;r++)
    {
   
    String count=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
    int sum=Integer.parseInt(count);
    i=sum+i;
    }
    System.out.println(i);
	}
}
	
		
		