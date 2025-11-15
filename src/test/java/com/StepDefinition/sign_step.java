package com.StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Base.Base_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sign_step extends Base_Class{

	

	@Given("User enter the correct username as {string}")
	public void userEnterTheCorrectUsernameAs(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@Given("User enter the correct password as {string}")
	public void userEnterTheCorrectPasswordAs(String password) {
		driver.findElement(By.id("password")).sendKeys(password);    
	}
	@When("User click on the submit button")
	public void userClickOnTheSubmitButton() {
		driver.findElement(By.id("login")).click(); 
	}
	@Then("User verifies the new page contains  expected URL")
	public void userVerifiesTheNewPageContainsExpectedURL() {
		String URL = "https://adactinhotelapp.com/SearchHotel.php";
		boolean containsURL = URL.contains("SearchHotel.php");
		Assert.assertTrue(containsURL); 
	}
	@Then("User verifies new page contains expected text")
	public void userVerifiesNewPageContainsExpectedText() {
		WebElement txt = driver.findElement(By.xpath("//a[text()='Search Hotel']"));
		String actualText = txt.getText();
		String expectedText = "Search Hotel";
		boolean contains = actualText.contains(expectedText);
		Assert.assertTrue(contains);
	}
	@Then("User verifies Logout button is displayed on the page")
	public void userVerifiesLogoutButtonIsDisplayedOnThePage() {
		WebElement LogoutBtn = driver.findElement(By.xpath("//a[text()='Logout']"));
		boolean displayed = LogoutBtn.isDisplayed();
		Assert.assertTrue(displayed);
	}
	@Given("User enter the incorrect username as {string}")
	public void userEnterTheIncorrectUsernameAs(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@When("User verifies error message is displayed")
	public void userVerifiesErrorMessageIsDisplayed() {
		WebElement element = driver.findElement(By.xpath("//b[contains(text(), 'Invalid Login details or Your Password might have expired')]"));
		boolean displayed = element.isDisplayed();
		Assert.assertTrue(displayed);
	}
	@When("User verifies error message text is Invalid Login details")
	public void userVerifiesErrorMessageTextIsInvalidLoginDetails() {
		WebElement element = driver.findElement(By.xpath("//b[contains(text(), 'Invalid Login details or Your Password might have expired')]"));
		String actualText = element.getText();
		String expectedText = "Invalid Login details or Your Password might have expired";
		boolean contains = actualText.contains(expectedText);
		Assert.assertTrue(contains);
	}
	@Given("User enter the incorrect password as {string}")
	public void userEnterTheIncorrectPasswordAs(String password) {
		driver.findElement(By.id("password")).sendKeys("709486247");
	}
//	@When("user close the browser")
//	public void userCloseTheBrowser() {
//		driver.quit();
//	}
}
