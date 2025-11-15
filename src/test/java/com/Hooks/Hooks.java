package com.Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Base.Base_Class;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hooks extends Base_Class{
     
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@After
	public void tearDown() {
		driver.quit();

	}
	
	@Before(order = 2)
	public void beforeScenario(Scenario scenario) {
		String name = scenario.getName();
		System.out.println("Scenario Name is:"+name);
	}
	@Before(order = 1)
	public void beforeScenarioTwo(Scenario scenario) {
		String id = scenario.getId();
		System.out.println(id);
	}
	@After(order  = 1)
	public void afterScenario(Scenario scenario) {
		Status status = scenario.getStatus();
        System.out.println(status);
	}
	@After(order = 2)
	public void afterScenarioTwo(Scenario scenario) {
		Integer line = scenario.getLine();
		System.out.println("Line is:"+line);
	}
	@BeforeStep
	public void beforeSt() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	@AfterStep
	public void afterStep() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	
}
