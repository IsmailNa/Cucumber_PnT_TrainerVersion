package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterTN {

	public WebDriver driver;

	@Given("User navigates to RegisterPage")
	public void user_navigates_to_register_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
	}

	@When("User enters firstname {string} into firstname field")
	public void user_enters_firstname_into_firstname_field(String firstnameText) {
		driver.findElement(By.id("input-firstname")).sendKeys(firstnameText);
	}

	@When("User enters lastname {string} into lastname field")
	public void user_enters_lastname_into_lastname_field(String lastnameText) {
		driver.findElement(By.id("input-lastname")).sendKeys(lastnameText);
	}

	@When("User enters email {string} into email field")
	public void user_enters_email_into_email_field(String emailText) {
		driver.findElement(By.id("input-email")).sendKeys(emailText);
	}

	@When("User enters telephone {string} into telephone field")
	public void user_enters_telephone_into_telephone_field(String telephoneText) {
		driver.findElement(By.id("input-telephone")).sendKeys(telephoneText);

	}

	@When("User enters password {string} into password field")
	public void user_enters_password_into_password_field(String passwordText) {
		driver.findElement(By.id("input-password")).sendKeys(passwordText);
	}

	@When("User enters password {string} into confirmpassword field")
	public void user_enters_password_into_confirmpassword_field(String passwordText) {
		driver.findElement(By.id("input-confirm")).sendKeys(passwordText);
	}

	@When("User checks on PrivacyPolicy checkbox")
	public void user_checks_on_privacy_policy_checkbox() {
		driver.findElement(By.name("agree")).click();

	}

	@When("User clicks on Continue Button")
	public void user_clicks_on_continue_button() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}

	@Then("User account gets created successfully")
	public void user_account_gets_created_successfully() {
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id = 'content']/child::p[1]")).isDisplayed());

	}

}
