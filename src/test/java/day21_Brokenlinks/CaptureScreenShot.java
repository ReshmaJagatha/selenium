package day21_Brokenlinks;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		/*
		 * TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		//File target=new File("C:\\Users\\sreek\\eclipse-workspace\\MavenProject\\Screenshots\\fullpage.png");
		File target=new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
			FileUtils.copyFile(source, target);
			*/
		
	/*	WebElement location=driver.findElement(By.xpath("//div[@class='category-grid home-page-category-grid']//div[@class='item-grid']"));
			
		File source=location.getScreenshotAs(OutputType.FILE);
		File target =new File(System.getProperty("user.dir")+"\\Screenshots\\specific.png");
		FileUtils.copyFile(source,target);
		
		*/
		
		WebElement location=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		File source=location.getScreenshotAs(OutputType.FILE);
		File target =new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
		//FileUtils.copyFile(source,target);
		

	}

}
