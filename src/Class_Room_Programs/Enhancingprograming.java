package Class_Room_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Enhancingprograming {
	
	public WebDriver driver;
	
	

  @Test
  public void improvement() throws Exception {
	  
	  driver.findElement(By.id("firstName")).sendKeys("raja");
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("lastName")).sendKeys("ram");
	  Thread.sleep(3000);
	  driver.findElement(By.id("userEmail")).sendKeys("rajaram@gmail.com");
	  Thread.sleep(3000);
	  driver.findElement(By.id("gender")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.name("userNumber")).sendKeys("6281560771");
	  Thread.sleep(3000);
	  driver.findElement(By.name("dateOfBirthInput")).sendKeys("14 May 2022");
	  Thread.sleep(3000);
	  driver.findElement(By.id("subjectsInput")).sendKeys("maths");
	  Thread.sleep(3000);
	  driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  driver.findElement(By.id("hobbies-checkbox-1")).click();
	  Thread.sleep(3000);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\DSDB_WORKSPACE\\chromedriver.exe");
	  
	  driver=new ChromeDriver();
	  
	  driver.get("https://demoqa.com/automation-practice-form");
	  
	  driver.manage().window().minimize();
  }

  @AfterTest
  public void afterTest() {
  }

}
