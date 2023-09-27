package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchProductTN {
	public WebDriver driver;
	
	@Given("User navigates to the HomePage")
	public void user_navigates_to_the_home_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");   
	}

	@And("User enters valid product {string} into search box field")
	public void user_enters_valid_product_into_search_box_field(String validProductText) {
		driver.findElement(By.name("search")).sendKeys(validProductText);  
	}

	@And("User clicks on Search button")
	public void user_clicks_on_search_button() {
	   driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
	}

	@Then("User gets valid product display in search results and system navigates to SearchPage")
	public void user_gets_valid_product_display_in_search_results_and_system_navigates_to_search_page() {
	   Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed()); 
	}


}
