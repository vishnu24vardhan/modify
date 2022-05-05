package Class_Room_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alerts {
	
	public WebDriver driver;
  @Test
  public void handlingalerts() throws Exception{
	  
	  driver.findElement(By.id("alertButton")).click();
	  
	  String str = driver.switchTo().alert().getText();
	  
		System.out.println(str);
		  
		  Thread.sleep(3000);
		  
		  
		 driver.switchTo().alert().accept();
		 

	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","\\D:\\DSDB_WORKSPACE\\chromedriver.exe\\");
	  driver=new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  driver.get("http://https://www.savaari.com/");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
