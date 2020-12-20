package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch 
{
//	WebDriver driver=null;
//	
//	@Given("browser is open")
//	public void browser_is_open() 
//	{
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		System.out.println("browser is open");
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() 
//	{
//		driver.navigate().to("https://www.google.com.pk/");
//		System.out.println("user on search page");
//	}
//
//	@When("user enters text in search box")
//	public void user_enters_text_in_search_box() 
//	{
//		driver.findElement(By.name("q")).sendKeys("bla-talha");
//		System.out.println("user entered text");
//	}
//
//	@And("presses the search button")
//	public void presses_the_search_button() 
//	{
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		System.out.println("user hits enter");
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() 
//	{
//		System.out.println("user is nagivated to search results");
//		driver.close();
//	}
}
