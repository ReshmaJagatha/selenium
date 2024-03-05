package Day17_Tables;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Static {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();	
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://testautomationpractice.blogspot.com/");
    
    //no of rows
    int row= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
    System.out.println(row);
    
    //no of columns
    int col= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
    System.out.println(col);
    
    //finding single data
    String s= driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[2]")).getText();
    System.out.println(s);
    
    //reading all the data
    for(int r=2;r<=row;r++)
    {
    	for(int c=1;c<=col;c++)
    	{
    	String s1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"] ")).getText();
    	System.out.print(s1+" ");
    	
    	}
    	System.out.println();
    }
    
    //return data based on condition
    for(int r=2;r<=row;r++)
    {
    String name=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
    if(name.equals("Amit"))
    {
    String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
    
    System.out.println(bookname);
    }
    }
    
    //total price
    int sum=0;
   for(int r=2;r<=row;r++)
   {
	   
	  String ss= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
	  int i= Integer.parseInt(ss);
	  sum=sum+i;

   }
	  System.out.println(sum);
   
   
	
	
	}

}
