package Class_Room_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Boolean  {
	
	public WebDriver driver;
	
	

	
		
  @Test
  public void options() {
	  
	  //switching to round trip
	  
	  driver.findElement(By.xpath("//label[contains(text(),'Round Trip')]")).click();
	  
	  //print condition true or false
	  
	            boolean printcondition=driver.findElement(By.xpath("//label[contains(text(),'Round Trip')]")).isDisplayed();
	            
	            System.out.println("printcondition");
	            
	            WebElement ele1=driver.findElement(By.xpath("//label[contains(text(),'Round Trip')]"));
	            
	            if (ele1.isSelected()) {
	            
	            System.out.println("Pass");
	            
  } else {
            	  
            	  System.out.println("No Not available");
            	  
  }
            	  
             

	  
	  
	           
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\DSDB_WORKSPACE\\chromedriver.exe\\");
	  
	  driver=new ChromeDriver();
	  
	  driver.get("https://www.savaari.com/");
	  
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
