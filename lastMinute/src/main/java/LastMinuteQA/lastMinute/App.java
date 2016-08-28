package LastMinuteQA.lastMinute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	  public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        
	        System.setProperty("webdriver.chrome.driver", "C://Users//HP1//Documents//LastMinute//chromedriver_win32//chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.get("http://www.google.com");
			  if (driver.findElement(By.xpath("//input[@name='q']")).isEnabled()) {
			   System.out.println("Google search text box Is enabled.");
			   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("WebDriver Test successful.");
	     	   driver.findElement(By.xpath("	//button[@name='btnG']")).click();
			   System.out.println("Google search completed.");
			  } else {
			   System.out.println("Google search test box Is Not enabled.");

			  }
			  driver.close();
			  System.out.println( "Hello World!2" );
			 }
//			  driver.get("http://trips.lastminute.com/hotel/route/search-results?search.type=OSE&search.accomodationOnly=true&search.destinationCities=136281&search.destinationTag=&search.departureAirports=&search.departureIntervals=20160917-20160920&search.rooms[0].adults=2&search.rooms[0].children=0&businessProfileId=HOLIDAYSLASTMINUTECOUK&noCache=1472393260487&searchId=44986634");
//			  driver.close();
	    
	    
	    
	    
	    	
    
    }

