package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTN {
	
	public WebDriver driver;
	
	@Given("User navigates to LoginPage")
	public void user_navigates_to_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}

	@When("User enters valid email {string} into email field")
	public void user_enters_valid_email_into_email_field(String validEmailText) {
		driver.findElement(By.id("input-email")).sendKeys(validEmailText);
	}

	@And("User enters valid password {string} into password field")
	public void user_enters_valid_password_into_password_field(String validPasswordText) {
		driver.findElement(By.id("input-password")).sendKeys(validPasswordText);
	    
	}

	@And("User clicks on Login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	@Then("User successfully logins into AccountPage")
	public void user_successfully_logins_into_account_page() {
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	}

	
}
