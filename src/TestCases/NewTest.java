package TestCases;

import org.testng.annotations.Test;
//import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.support.ui.WebDriverWait;

//import java.time.Duration;

public class NewTest {
	WebDriver driver;
	
	 @BeforeMethod
    public void Setup() {
    	 System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
 		
	        driver= new ChromeDriver();
	        driver.manage().window().setSize(new Dimension(1024, 768));
			driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
    }
	
	 @Test(priority = 1)
	  public void task2() throws InterruptedException  {
		    Actions scroll = new Actions(driver);
	        scroll.sendKeys(Keys.PAGE_DOWN).build().perform();
	        //
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(@onclick,'1467469338690')])[2]")));
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("(//a[contains(@onclick,'1467469338690')])[2]")).click(); 
		      
	       scroll.sendKeys(Keys.PAGE_DOWN).build().perform();
//scrolling down
	       WebElement e=driver.findElement(By.xpath("(//*[@class=' '])[4]"));
	       Coordinates cor=((Locatable)e).getCoordinates();
	       cor.inViewPort();

	       Thread.sleep(1000);  
	        driver.findElement(By.xpath("//*[@class='col-md-4 mb-1 booking-input pr-2']")).click(); 

		     //   WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
			//    wait2.until(org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//*[@class=' '])[3]")));

           driver.findElement(By.xpath("(//*[@class=' '])[3]")).click();	
                //search
		   driver.findElement(By.xpath("//*[@class='col-md-22 mb-1 booking-input']")).click();
           driver.findElement(By.xpath("(//*[@class=' '])[3]")).click();	
		   driver.findElement(By.xpath("//*[@class='col-md-22 mb-1 booking-input']")).click();


              //select seat	
			   WebElement b=driver.findElement(By.xpath("//*[@id=\"ForwardResults\"]/div[6]/div[1]/div[1]/div[3]"));
		       Coordinates cord=((Locatable)b).getCoordinates();
		       cord.inViewPort();
		       Thread.sleep(1000);  
		       scroll.sendKeys(Keys.PAGE_DOWN).build().perform();
	
		       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		       wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='select-service'][1]/input[@id='SrvcSelectBtnForward2']")));
		       Thread.sleep(3000);
			   driver.findElement(By.xpath("//*[@class='select-service'][1]/input[@id='SrvcSelectBtnForward2']")).click();

		   //choose number15
			   WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(30));
			   wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='nav-item'])[9]")));

			   Thread.sleep(3000);
			   WebElement f=driver.findElement(By.xpath("(//*[@class='nav-item'])[9]"));
			   Coordinates cordi=((Locatable)f).getCoordinates();
			   cordi.inViewPort();
				  
	//	   driver.findElement(By.xpath("//*[@class='selectedSeatClassS'][1]//span[@class='seatNumber'][1]")).click();
		   
			  //drop point
			  driver.findElement(By.xpath("(//*[@class='nav-item'])[9]")).click();
			  

			  //point
			    WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
		        wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='tab-content']//*[@class='bordingPoint-list']//*[@class='p-2 Forward-droping']")));

		        Thread.sleep(3000);
		        WebElement z=driver.findElement(By.xpath("(//*[@class='nav-item'])[9]"));
			    Coordinates cordin=((Locatable)z).getCoordinates();
				cordin.inViewPort();
					  
			  driver.findElement(By.xpath("//*[@class='tab-content']//*[@class='bordingPoint-list']//*[@class='p-2 Forward-droping']")).click();
			  
			  //customer details
			//  WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(30));
		   //   wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='nav-item']//*[@class='nav-link active show']")));
		   //   driver.findElement(By.xpath("//*[@class='nav-item']//*[@class='nav-link active show']")).click();
			//  WebElement q=driver.findElement(By.xpath("//*[@class='nav-item']//*[@class='nav-link active show']"));
			//    Coordinates cordinate =((Locatable)q).getCoordinates();
			//	cordinate.inViewPort();

		    //  driver.findElement(By.xpath("//*[@class='nav-item']//*[@class='nav-link active show']")).click();

			  //mobile
			  WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(30));
		      wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='form-control'])[1]")));
			  driver.findElement(By.xpath("(//*[@class='form-control'])[1]")).click();
			  WebElement x=driver.findElement(By.xpath("(//*[@class='form-control'])[1]"));
			    Coordinates cordina=((Locatable)x).getCoordinates();
				cordina.inViewPort();
			  driver.findElement(By.xpath("//*[@id='ForwardPxLoginDv']//input[@id='mobileNo']")).sendKeys("6789125987");	 
		        Thread.sleep(3000);

			  driver.findElement(By.xpath("//*[@id='ForwardinPxLoginDv']//input[@id='email']")).sendKeys("alisheren85@gmail.com");
		        Thread.sleep(3000);

		      scroll.sendKeys(Keys.PAGE_DOWN).build().perform(); 
		//	  driver.findElement(By.xpath("(//*[@id='PgBtn'])")).click();
		      
		      
	 }
	 @AfterMethod
	 
	   public void Close () throws InterruptedException {	
		 ((ChromiumDriver) driver).getSessionStorage().clear();
	      ((ChromiumDriver) driver).getLocalStorage().clear();	
          driver.close();
	 }
   
}