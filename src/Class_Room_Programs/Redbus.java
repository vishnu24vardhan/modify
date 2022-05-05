package Class_Room_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Redbus {
	
	public WebDriver driver;
  @Test
  public void redbus()  throws Exception{
	  
	  driver.findElement(By.xpath("//header/div[1]/div[1]/nav[1]/a[1]")).click();
	 
	  driver.findElement( By.xpath(".//*[@id='txtSource']")).sendKeys("vizag");
				
		
	  driver.findElement(By.xpath("//*[@id='txtDestination']")).sendKeys("warangal");
		
				
		driver.findElement(By.xpath(".//*[@id='txtOnwardCalendar']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']")).sendKeys("29-april-2022");
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/button")).click();
		
		
		Thread.sleep(3000);
	
		
		driver.findElement(By.xpath("//body/section[@id='rh_main']/div[@id='mBWrapper']/div[@id='root']/div[1]/div[2]/div[2]/div[3]/div[1]/ul[1]/div[1]/li[1]/div[1]/div[2]/div[1]")).click();
		
		
		driver.findElement(By.xpath("//body/section[@id='rh_main']/div[@id='mBWrapper']/div[@id='root']/div[1]/div[2]/div[2]/div[3]/div[1]/ul[1]/div[1]/li[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[1]")).click();
		
		
		driver.findElement(By.id("gotoseat_btn")).click();
		
		
		driver.findElement(By.xpath("//body/section[@id='rh_main']/div[@id='mBWrapper']/div[@id='root']/div[1]/div[2]/div[2]/div[3]/div[1]/ul[1]/div[1]/li[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/canvas[1]")).click();
		
		
		driver.findElement(By.xpath("//button[@id='']")).click();
		
		
		driver.findElement(By.id("seatno-04")).sendKeys("akula vishnuvardhan");
		
		
		driver.findElement(By.xpath("//*[@id=\"22_0\"]")).click();
		
		
		driver.findElement(By.id("seatno-01")).sendKeys("25");
		
		
		driver.findElement(By.id("seatno-14")).sendKeys("chandu");
		
		
		driver.findElement(By.name("Gender1")).click();
		
		
		driver.findElement(By.id("seatno-11")).sendKeys("25");
	    
		
		driver.findElement(By.id("seatno-05")).sendKeys("vishnucrpf1@gmail.com");
		
		
		driver.findElement(By.xpath("//*[@id=\"6\"]")).click();
		
		
		driver.findElement(By.xpath("//input[@id='seatno-06']")).sendKeys("6281560771");
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[3]/div[2]/div[2]/input")).click();
		
		
		driver.findElement(By.id("Credit Card")).click();
		
		
		
		driver.findElement(By.name("cardNo")).sendKeys("5181590311725108");
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[4]/div/div[3]/div[2]/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div/input")).sendKeys("akula vishnuvardhan");
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[4]/div/div[3]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div[1]")).sendKeys("04");
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[4]/div/div[3]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/div[2]")).sendKeys("2023");
		
		
		driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div/div[2]/div[1]/div[4]/div/div[3]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[2]/div/input")).sendKeys("880");
		
		driver.findElement(By.xpath("//div[contains(text(),'PAY INR 2121')]")).click();
		
		

		
		
		
		
		
		
				
	  
	  
	  
	  
  }
 
  
  
  @BeforeTest
  public void beforeTest() {
	  
System.setProperty("webdriver.chrome.driver", "D:\\DSDB_WORKSPACE\\chromedriver.exe\\");
	  
	  driver=new ChromeDriver();
	  
	  driver.get("https://www.redbus.in/bus-tickets");
	  
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
