package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefinition {
	WebDriver driver;

	@Given("User is already on login page")
	public void user_is_already_on_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/saied rahman/utilities/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}

	@When("Tittle of Login Page is SWAGLABS")
	public void tittle_of_login_page_is_swaglabs() {
		String tittle = driver.getTitle();
		System.out.println(tittle);
		// Assert.assertEquals("Single Page Apps for GitHub Pages",tittle );
	}

	@Then("User enter username and password")
	public void user_enter_username_and_password() {
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");

	}

	@Then("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("User is on home page")
	public void user_is_on_home_page() {
		String tittle = driver.getTitle();
		System.out.println("Home Page tittle "+ tittle);
		Assert.assertEquals("Single Page Apps for GitHub Pages", tittle);
	}

}
