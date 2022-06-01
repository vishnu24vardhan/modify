package Class_Room_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class Screenshot {
	
	public WebDriver driver;
	
	
	
	
	
	
	
  @Test
  public void alertscreen() throws Exception{
	  
	  driver.findElement(By.id("alertButton")).click();
	  
	  Thread.sleep(3000);
	  
	String str1=driver.switchTo().alert().getText();
	
	System.out.println(str1);
	
	Thread.sleep(3000);
	
	driver.switchTo().alert().accept();
	
	String ATM= "VISHNU1";
	
	File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileHandler.copy(scrfile, new File("D:\\DSDB_WORKSPACE\\screenshoots\\"+ATM+".png"));
	
	
	
	

	  
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","\\D:\\DSDB_WORKSPACE\\chromedriver.exe\\");
	  
	  driver=new ChromeDriver();
	  
	  driver.get("https://demoqa.com/alerts");
	  
	  String ATM= "VISHNU1";
		
		File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(scrfile, new File("D:\\DSDB_WORKSPACE\\screenshoots\\"+ATM+".png"));
		
	  
	  
	  
	  
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
	  
  }

}
