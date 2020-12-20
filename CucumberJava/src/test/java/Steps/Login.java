package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login 
{
	WebDriver driver=null;
	
	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://example.testproject.io/web/");
		System.out.println("user on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("//input[@id='name']")).sendKeys("talha");
		driver.findElement(By.id("//input[@id='password']")).sendKeys("12345");
		
		
		System.out.println("user enter username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() 
	{
		driver.findElement(By.id("//button[@id='login']")).click();
		System.out.println("user clicks on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() 
	{
		driver.findElement(By.id("//button[@id='logout']")).isDisplayed();
		System.out.println("user is navigated to the home page");
	}

	/*@When("user enters User1 and pass1")
	public void user_enters_user1_and_pass1() 
	{
		System.out.println("user enters User1 and pass1");
	}

	@When("user enters User2 and pass2")
	public void user_enters_user2_and_pass2() 
	{
		System.out.println("user enters User2 and pass2");
	}*/
}
