package Class_Room_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;

import org.checkerframework.checker.units.qual.Length;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class array {
	
	public WebDriver driver;

	@Test
	public void fun() throws Exception {

		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(3000);
		
		String str = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul")).getText();
		Thread.sleep(3000);

		System.out.println(str);

		System.out.println(str.length());
		
		String a[] = str.split("\n");

		System.out.println(a);
		
		System.out.println(a.length);
		

		for (int i = 0; i < a.length; i++) {
			
			
			
			if (a[i].equalsIgnoreCase("selenium webdriver")) {
				
				driver.findElement(By.name("q")).clear();
				   Thread.sleep(3000);
				  driver.findElement(By.name("q")).sendKeys(a[i]);
					  Thread.sleep(3000);
					  System.out.println(a[i]);
					  
					  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
				break;
					 

			}

			driver.findElement(By.name("q")).clear();

			Thread.sleep(3000);

			driver.findElement(By.name("q")).sendKeys(a[i]);
			Thread.sleep(3000);


			  
			  
			  
			
		}
		
	}
	  
	  
	  
	  
	  
	  
			  
			 
			  
			  
			
		
		
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\DSDB_WORKSPACE\\chromedriver.exe\\");
	  
		driver  =new ChromeDriver();
		
		driver.get("http://google.com");
		
		driver.manage().window().minimize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
