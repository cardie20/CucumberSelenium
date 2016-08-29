package LastMinuteQA.lastMinute;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Class intended to test that button "modify search" is shown in the LastMinute WebPage
 * @author Rebeca Perez Lainez  rebeca.perez.lainez@gmail.com
 *
 */
public class ButtonModifyStepDefinition {


	public WebDriver driver;	
	public WebElement button; 


	@Before
	public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C://Users//HP1//Documents//LastMinute//chromedriver_win32//chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}


	@Given("^A user makes hotels search in madrid$")
	public void navigate(){
		driver.get("http://trips.lastminute.com/hotel/route/search-results?search.type=OSE&search.accomodationOnly=true&search.destinationCities=136281&search.destinationTag=&search.departureAirports=&search.departureIntervals=20160917-20160920&search.rooms[0].adults=2&search.rooms[0].children=0&businessProfileId=HOLIDAYSLASTMINUTECOUK&noCache=14724951579922");


	}

	@When ("^the user lands in hotels result page$")
	public void lands_in_hotel_result(){

		String expectedText= "Hotels | Luxury Hotels & Cheap Hotel Deals | lastminute.com";
		driver.getTitle();
		Assert.assertTrue(driver.getTitle().equals(expectedText));		

	}

	@Then("^is shown a Modify Search button in the hotels result page$")
	public void verifySuccessful(){
		try{

			button = driver.findElement(By.id("FT_modifySearchButton"));
			Assert.assertTrue(button.isDisplayed());

		}catch (StaleElementReferenceException exception){
			Assert.fail("Exception"+exception);
		}


		//#      Assert.assertTrue("Login not successful",expectedText.equals(actualText));

	}

	@After
	public void tearDown() {
		driver.quit();
	} 
}
