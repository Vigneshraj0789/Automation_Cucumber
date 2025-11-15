package com.StepDefinition;

//import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//public class Login_Step {

//	WebDriver driver;
//
//
//	@Given("User launch the browser and URL")
//	public void userLaunchTheBrowserAndURL() {
//		driver = new ChromeDriver();
//		driver.get("https://adactinhotelapp.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}
//	@Given("User enter the correct {string}  {string}")
//	public void userEnterTheCorrect(String username, String password) {
//		driver.findElement(By.id("username")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//	}
//
///*	@Given("User enter the correct username password")
//	public void userEnterTheCorrectUsernamePassword(DataTable dataTable) {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//	    List<Map<String, String>> asMaps = dataTable.asMaps(String.class,String.class);
//	    String username = asMaps.get(0).get("username");
//	    String password = asMaps.get(0).get("password");
//	    driver.findElement(By.id("username")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//	}
//
///*	@Given("User enter the correct username password")
//	public void userEnterTheCorrectUsernamePassword(DataTable dataTable) {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//	 List<List<String>> asLists = dataTable.asLists(String.class);
//	 String username = asLists.get(0).get(0);
//	 String password = asLists.get(0).get(1);
//	 driver.findElement(By.id("username")).sendKeys(username);
//	 driver.findElement(By.id("password")).sendKeys(password);
//     }
//     
///*	@Given("User enter the correct username as {string}")
//	public void userEnterTheCorrectUsernameAs(String username) {
//       driver.findElement(By.id("username")).sendKeys(username);
//	}
//	@Given("User enter the correct password as {string}")
//	public void userEnterTheCorrectPasswordAs(String password) {
//       driver.findElement(By.id("password")).sendKeys(password);
//	}
//*/
//	//	@Given("User enter the correct username")
//	//	public void userEnterTheCorrectUsername() {
//	//		driver.findElement(By.id("username")).sendKeys("Vigneshraj07");
//	//	}
//	//	@Given("User enter the correct password")
//	//	public void userEnterTheCorrectPassword() {
//	//		driver.findElement(By.id("password")).sendKeys("7094862477");
//	//	}
//	@When("User click on the submit button")
//	public void userClickOnTheSubmitButton() {
//		driver.findElement(By.id("login")).click();
//	}
//	@Then("User verifies the new page contains  expected URL")
//	public void userVerifiesTheNewPageContainsExpectedURL() {
//		String URL = "https://adactinhotelapp.com/SearchHotel.php";
//		boolean containsURL = URL.contains("SearchHotel.php");
//		Assert.assertTrue(containsURL);
//	}
//	@Then("User verifies new page contains expected text")
//	public void userVerifiesNewPageContainsExpectedText() {
//		WebElement txt = driver.findElement(By.xpath("//a[text()='Search Hotel']"));
//		String actualText = txt.getText();
//		String expectedText = "Search Hotel";
//		boolean contains = actualText.contains(expectedText);
//		Assert.assertTrue(contains);
//	}
//	@Then("User verifies Logout button is displayed on the page")
//	public void userVerifiesLogoutButtonIsDisplayedOnThePage() {
//		WebElement LogoutBtn = driver.findElement(By.xpath("//a[text()='Logout']"));
//		boolean displayed = LogoutBtn.isDisplayed();
//		Assert.assertTrue(displayed);
//	}
//	@Given("User enter the incorrect username as {string}")
//	public void userEnterTheIncorrectUsernameAs(String username) {
//		 driver.findElement(By.id("username")).sendKeys(username);
//	}
//
//	//	@Given("User enter the incorrect username")
//	//	public void userEnterTheIncorrectUsername() {
//	//		driver.findElement(By.id("username")).sendKeys("VigneshrajN");
//	//	}
//	@When("User verifies error message is displayed")
//	public void userVerifiesErrorMessageIsDisplayed() {
//		WebElement element = driver.findElement(By.xpath("//b[contains(text(), 'Invalid Login details or Your Password might have expired')]"));
//		boolean displayed = element.isDisplayed();
//		Assert.assertTrue(displayed);
//	}
//	@When("User verifies error message text is Invalid Login details")
//	public void userVerifiesErrorMessageTextIsInvalidLoginDetails() {
//		WebElement element = driver.findElement(By.xpath("//b[contains(text(), 'Invalid Login details or Your Password might have expired')]"));
//		String actualText = element.getText();
//		String expectedText = "Invalid Login details or Your Password might have expired";
//		boolean contains = actualText.contains(expectedText);
//		Assert.assertTrue(contains);
//	}
//
//	@Given("User enter the incorrect password as {string}")
//	public void userEnterTheIncorrectPasswordAs(String password) {
//		 driver.findElement(By.id("password")).sendKeys(password);
//	}
//
//	//	@Given("User enter the incorrect password")
//	//	public void userEnterTheIncorrectPassword() {
//	//		driver.findElement(By.id("password")).sendKeys("709486247");
//	//	    
//	//	}
//
//}
