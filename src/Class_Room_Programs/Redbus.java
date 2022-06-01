package Class_Room_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Redbus {
	
	public WebDriver driver;
  @Test
  public void dunzo()  throws Exception{
	  
	  driver.findElement(By.xpath("//p[contains(text(),'Sign in')]")).click();
	  
	  driver.findElement(By.name("phone")).sendKeys("6281560771");
	  
	 driver.findElement(By.xpath("//*[@id=\"expandable-view\"]/div/div[3]/div/div/div[4]/div/div[1]/label[1]")).click();
	 
	 driver.findElement(By.xpath("//button[contains(text(),'Send OTP')]")).click();
	 
	 
	 
	 driver.findElement(By.xpath("//body/div[@id='__next']/div[@id='modal']/div[1]/div[2]/div[1]/i[1]")).click();
	 
	 driver.findElement(By.xpath("//p[contains(text(),'SET LOCATION')]")).click();
	 
	 driver.findElement(By.id("__NEXT_DATA__")).sendKeys("warangal");
	 
	 driver.findElement(By.id("__NEXT_DATA__")).sendKeys(Keys.ENTER);
	 
	 driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]/svg[1]/g[1]/path[1]")).click();
	 
	 driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[5]/div[1]/div[1]/a[1]/img[1]")).click();
	 
	driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div[2]/div/div/div/div/input")).sendKeys("thums up");
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div[2]/div/div/div/div/input")).sendKeys(Keys.ENTER);
	
	driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[3]/div[1]/div[1]/button[1]")).click();
	
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/svg[2]/circle[1]")).click();
	
	driver.findElement(By.xpath("//button[contains(text(),'Add item')]")).click();
	
	driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/button[2]")).click();
	
	driver.findElement(By.xpath("//button[contains(text(),'Repeat')]")).click();
	
	driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/div[3]/div[1]/button[1]")).click();
	
	driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
	
	driver.findElement(By.xpath("//body/div[@id='__next']/div[@id='expandable-view']/div[2]/div[3]/div[1]/div[1]/div[2]/input[1]")).sendKeys("madhapur");
	
	
	driver.findElement(By.xpath("//body/div[@id='__next']/div[@id='expandable-view']/div[2]/div[3]/div[1]/div[1]/div[2]/input[1]")).sendKeys(Keys.ENTER);
	
	driver.findElement(By.xpath("//body/div[@id='__next']/div[@id='expandable-view']/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
	
	driver.findElement(By.name("appartmentAddress")).sendKeys("10-90\1 autonagar");
	
	driver.findElement(By.name("contactName")).sendKeys("vishnu");
	
	driver.findElement(By.xpath("//body/div[@id='__next']/div[@id='expandable-view']/div[2]/div[3]/div[1]/div[1]/div[3]/form[1]/div[1]/div[3]/div[1]/div[1]/button[1]")).click();
	
	driver.findElement(By.name("landmark")).sendKeys("life fittness zym");
	
	driver.findElement(By.name("contactNumber")).sendKeys("6281560771");
	
	driver.findElement(By.xpath("//body/div[@id='__next']/div[@id='expandable-view']/div[2]/div[3]/div[1]/div[1]/div[3]/form[1]/div[2]/button[1]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div/div/div[1]/div/div[5]/div[2]/div/div/div/div/div[1]/div/button[2]")).click();
	
	driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]")).click();
	
	driver.findElement(By.id("card_number")).sendKeys("5008 5608 5015 0785 2");
	
	driver.findElement(By.id("card_exp_month")).sendKeys("08");
	
	driver.findElement(By.id("card_exp_year")).sendKeys("22");
	
	driver.findElement(By.id("security_code")).sendKeys("123");
	
	driver.findElement(By.id("name_on_card")).sendKeys("vishnu");
	
	driver.findElement(By.id("pay_btn")).click();
	
	driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/div[1]/div[2]")).click();
	
	driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
	
	driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
	
	
	
	
	
	
	
	 
	 
	 
	 
	 
	 
	  
	  
	  
	  
	  
		
		

		
		
		
		
		
		
				
	  
	  
	  
	  
  }
 
  
  
  @BeforeTest
  public void beforeTest() {
	  
System.setProperty("webdriver.chrome.driver", "D:\\DSDB_WORKSPACE\\chromedriver.exe\\");
	  
	  driver=new ChromeDriver();
	  
	  driver.get("https://www.dunzo.com/");
	  
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
