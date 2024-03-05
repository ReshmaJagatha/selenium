package Assignments;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assign2_HandleWindows {

	public static void main(String[] args) throws InterruptedException
	{
		
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://testautomationpractice.blogspot.com ");
	/*String s= driver.findElement(By.xpath("//h1[contains(text(),'Testing')]")).getText();
	System.out.println(s);
	
	List<WebElement> count= driver.findElements(By.tagName("a"));
	System.out.println("The number of links:"+ count.size());
	System.out.println(driver.getWindowHandle());
	 driver.close();
    for(WebElement w:count)
	{
		w.click();
	
	}
	
	
	
	for(WebElement w:count)
	{
	System.out.println(w.getText() + " - " + w.getAttribute("href"));
	w.click();
	}
	List<WebElement> linksize = driver.findElements(By.tagName("a")); 
	linksCount = linksize.size();
	System.out.println("Total no of links Available: "+linksCount);
	links= new String[linksCount];
	System.out.println("List of links Available: ");  
	// print all the links from webpage 
	for(int i1=0;i1<linksCount;i1++)
	{
	links[i1] = linksize.get(i1).getAttribute("href");
	
	//System.out.println(links.get(i1).getAttribute("href"));
	} 
	// navigate to each Link on the webpage
	for(int i=0;i<linksCount;i++)
	{
	driver.navigate().to(links[i]);
	Thread.sleep(3000);

	}*/
	driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");

	driver.findElement(By.xpath("//input[@type='submit']")).click();
    List<WebElement> count=driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a"));
    System.out.println(count.size());
    for(WebElement w:count)
    {
 
    	System.out.println(w.getText());
    	w.click();
    }
    Set<String> ids=driver.getWindowHandles();
    for(String id :ids)
    {
    String title=driver.switchTo().window(id).getTitle();
    if(title.equals("Selenium in biology - Wikipedia"))
    {
    	driver.close();
    }
    }
	}
}
