package Class_Room_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Popup {
	
	public WebDriver driver;
	
  @Test
  public void windowpopup() throws Exception  {
	  //Clicks on Separate windows
	  driver.findElement(By.xpath("//a[@href='#Seperate'][contains(.,'Open New Seperate Windows')]")).click();
	  
	 Thread.sleep(5000);
	//Click_button
	 driver.findElement(By.xpath("//button[@class='btn btn-primary'][contains(.,'click')]")).click();
	 Thread.sleep(5000);
	 
	//comeback to Parent window handle
	         String backtoparentwindow=driver.getWindowHandle();
	         
	         for(String childwindowandle : driver.getWindowHandles()) {
	        	//Clicks on Blog_Button
	        	 
	        	 driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[7]/a/span")).click();
	        	 
	        	driver.close();
	        	//Again Switch focus back to Parent window
	        	
	        	driver.switchTo().window(backtoparentwindow);
	        	
	        Thread.sleep(3000);
	  	  //Clicks on Home_Button

	        
	        driver.findElement(By.linkText("Home")).click();
			 Thread.sleep(3000);

	        	 
	        	 
 
	            	 
	             }
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","\\D:\\DSDB_WORKSPACE\\chromedriver.exe\\");
	  
	
	driver=new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Windows.html");
	
	driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
